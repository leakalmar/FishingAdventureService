package isa.FishingAdventure.dto;

import java.util.List;

// DTO koji enkapsulira generisani JWT i njegovo trajanje koji se vracaju klijentu
public class UserTokenState {
	
    private String accessToken;
    private Long expiresIn;
    private String email;
    private List<String> roles;
    
    
	public UserTokenState() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserTokenState(String accessToken, Long expiresIn, String email, List<String> roles) {
		super();
		this.accessToken = accessToken;
		this.expiresIn = expiresIn;
		this.email = email;
		this.roles = roles;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public Long getExpiresIn() {
		return expiresIn;
	}
	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

  
    
}