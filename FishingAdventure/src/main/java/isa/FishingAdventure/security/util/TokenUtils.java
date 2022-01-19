package isa.FishingAdventure.security.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import isa.FishingAdventure.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class TokenUtils {

    @Value("spring-security-example")
    private String APP_NAME;


    @Value("somesecret")
    public String SECRET;


    @Value("1800000")
    private int EXPIRES_IN;


    @Value("Authorization")
    private String AUTH_HEADER;


    private static final String AUDIENCE_WEB = "web";


    private SignatureAlgorithm SIGNATURE_ALGORITHM = SignatureAlgorithm.HS512;


    /**
     * Funkcija za generisanje JWT tokena.
     *
     * @param username Korisničko ime korisnika kojem se token izdaje
     * @return JWT token
     */
    public String generateToken(String username, String role, Boolean isRefreshToken) {
        return Jwts.builder()
                .setIssuer(APP_NAME)
                .setSubject(username)
                .claim("role", role)
                .setAudience(generateAudience())
                .setIssuedAt(new Date())
                .setExpiration(generateExpirationDate(isRefreshToken))
                .signWith(SIGNATURE_ALGORITHM, SECRET).compact();

    }

    /**
     * Funkcija za utvrđivanje tipa uređaja za koji se JWT kreira.
     *
     * @return Tip uređaja.
     */
    private String generateAudience() {


        return AUDIENCE_WEB;
    }

    /**
     * Funkcija generiše datum do kog je JWT token validan.
     *
     * @return Datum do kojeg je JWT validan.
     */
    private Date generateExpirationDate(Boolean isRefreshToken) {
        Date date;
        if (isRefreshToken.equals(true)) {
            date = new Date(new Date().getTime() + 3600000);
        } else {
            date = new Date(new Date().getTime() + EXPIRES_IN);
        }
        return date;
    }


    /**
     * Funkcija za preuzimanje JWT tokena iz zahteva.
     *
     * @param request HTTP zahtev koji klijent šalje.
     * @return JWT token ili null ukoliko se token ne nalazi u odgovarajućem
     * zaglavlju HTTP zahteva.
     */
    public String getToken(HttpServletRequest request) {
        String authHeader = getAuthHeaderFromHeader(request);


        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            return authHeader.substring(7);
        }

        return null;
    }

    /**
     * Funkcija za preuzimanje vlasnika tokena (korisničko ime).
     *
     * @param token JWT token.
     * @return Korisničko ime iz tokena ili null ukoliko ne postoji.
     */
    public String getEmailFromToken(String token) {
        String username;

        try {
            final Claims claims = this.getAllClaimsFromToken(token);
            username = claims.getSubject();
        } catch (ExpiredJwtException ex) {
            throw ex;
        } catch (Exception e) {
            username = null;
        }

        return username;
    }

    /**
     * Funkcija za preuzimanje role vlasnika tokena.
     *
     * @param token JWT token.
     * @return Rola iz tokena ili null ukoliko ne postoji.
     */
    public String getRoleFromToken(String token) {
        String role;

        try {
            final Claims claims = this.getAllClaimsFromToken(token);
            role = claims.get("role", String.class);
        } catch (ExpiredJwtException ex) {
            throw ex;
        } catch (Exception e) {
            role = null;
        }

        return role;
    }

    /**
     * Funkcija za preuzimanje datuma kreiranja tokena.
     *
     * @param token JWT token.
     * @return Datum kada je token kreiran.
     */
    public Date getIssuedAtDateFromToken(String token) {
        Date issueAt;
        try {
            final Claims claims = this.getAllClaimsFromToken(token);
            issueAt = claims.getIssuedAt();
        } catch (ExpiredJwtException ex) {
            throw ex;
        } catch (Exception e) {
            issueAt = null;
        }
        return issueAt;
    }

    /**
     * Funkcija za preuzimanje informacije o uređaju iz tokena.
     *
     * @param token JWT token.
     * @return Tip uredjaja.
     */
    public String getAudienceFromToken(String token) {
        String audience;
        try {
            final Claims claims = this.getAllClaimsFromToken(token);
            audience = claims.getAudience();
        } catch (ExpiredJwtException ex) {
            throw ex;
        } catch (Exception e) {
            audience = null;
        }
        return audience;
    }

    /**
     * Funkcija za preuzimanje datuma do kada token važi.
     *
     * @param token JWT token.
     * @return Datum do kojeg token važi.
     */
    public Date getExpirationDateFromToken(String token) {
        Date expiration;
        try {
            final Claims claims = this.getAllClaimsFromToken(token);
            expiration = claims.getExpiration();
        } catch (ExpiredJwtException ex) {
            throw ex;
        } catch (Exception e) {
            expiration = null;
        }

        return expiration;
    }

    /**
     * Funkcija za čitanje svih podataka iz JWT tokena
     *
     * @param token JWT token.
     * @return Podaci iz tokena.
     */
    private Claims getAllClaimsFromToken(String token) {
        Claims claims;
        try {
            claims = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (ExpiredJwtException ex) {
            throw ex;
        } catch (Exception e) {
            claims = null;
        }


        return claims;
    }


    /**
     * Funkcija za validaciju JWT tokena.
     *
     * @param token       JWT token.
     * @param userDetails Informacije o korisniku koji je vlasnik JWT tokena.
     * @return Informacija da li je token validan ili ne.
     */
    public Boolean validateToken(String token, UserDetails userDetails) {
        List<String> roles = userDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());

        Client userClient = null;
        VacationHomeOwner userHomeOwner = null;
        BoatOwner userBoatOwner = null;
        FishingInstructor userInstructor = null;
        Admin userAdmin = null;
        switch (roles.get(0)) {
            case "ROLE_CLIENT":
                userClient = (Client) userDetails;
                break;
            case "ROLE_VACATION_HOME_OWNER":
                userHomeOwner = (VacationHomeOwner) userDetails;
                break;
            case "ROLE_BOAT_OWNER":
                userBoatOwner = (BoatOwner) userDetails;
                break;
            case "ROLE_FISHING_INSTRUCTOR":
                userInstructor = (FishingInstructor) userDetails;
                break;
            case "ROLE_ADMIN":
                userAdmin = (Admin) userDetails;
                break;
            default:
                break;

        }
        final String username = getEmailFromToken(token);
        final Date created = getIssuedAtDateFromToken(token);

        if (userAdmin != null) {
            return (username != null
                    && username.equals(userDetails.getUsername())
                    && !isCreatedBeforeLastPasswordReset(created, userAdmin.getLastPasswordResetDate()));
        } else if (userClient != null) {
            return (username != null
                    && username.equals(userDetails.getUsername())
                    && !isCreatedBeforeLastPasswordReset(created, userClient.getLastPasswordResetDate()));
        } else if (userInstructor != null) {
            return (username != null
                    && username.equals(userDetails.getUsername())
                    && !isCreatedBeforeLastPasswordReset(created, userInstructor.getLastPasswordResetDate()));
        } else if (userHomeOwner != null) {
            return (username != null
                    && username.equals(userDetails.getUsername())
                    && !isCreatedBeforeLastPasswordReset(created, userHomeOwner.getLastPasswordResetDate()));
        } else if (userBoatOwner != null) {
            return (username != null
                    && username.equals(userDetails.getUsername())
                    && !isCreatedBeforeLastPasswordReset(created, userBoatOwner.getLastPasswordResetDate()));
        }
        return null;
    }

    /**
     * Funkcija proverava da li je lozinka korisnika izmenjena nakon izdavanja
     * tokena.
     *
     * @param created           Datum kreiranja tokena.
     * @param lastPasswordReset Datum poslednje izmene lozinke.
     * @return Informacija da li je token kreiran pre poslednje izmene lozinke ili
     * ne.
     */
    private Boolean isCreatedBeforeLastPasswordReset(Date created, Date lastPasswordReset) {
        return (lastPasswordReset != null && created.before(lastPasswordReset));
    }

    /**
     * Funkcija za preuzimanje perioda važenja tokena.
     *
     * @return Period važenja tokena.
     */
    public int getExpiredIn() {
        return EXPIRES_IN;
    }

    /**
     * Funkcija za preuzimanje sadržaja AUTH_HEADER-a iz zahteva.
     *
     * @param request HTTP zahtev.
     * @return Sadrzaj iz AUTH_HEADER-a.
     */
    public String getAuthHeaderFromHeader(HttpServletRequest request) {
        return request.getHeader(AUTH_HEADER);
    }

}