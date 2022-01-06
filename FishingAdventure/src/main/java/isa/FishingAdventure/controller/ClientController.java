package isa.FishingAdventure.controller;

import isa.FishingAdventure.dto.SubscriptionDto;
import isa.FishingAdventure.model.Client;
import isa.FishingAdventure.model.Image;
import isa.FishingAdventure.model.ServiceProfile;
import isa.FishingAdventure.security.util.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import isa.FishingAdventure.service.ClientService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "client")
public class ClientController{
	
	@Autowired
	private ClientService clientService;

	@Autowired
	private TokenUtils tokenUtils;

	@GetMapping(value = "/isSubscribed/{id}")
	@PreAuthorize("hasRole('ROLE_CLIENT')")
	public ResponseEntity<Boolean> getIsSubscribed(@RequestHeader("Authorization") String token, @PathVariable Integer id){
		String email = tokenUtils.getEmailFromToken(token.split(" ")[1]);
		Client client = clientService.findByEmail(email);
		boolean subscribed = clientService.isSubscribed(client, id);
		return new ResponseEntity<>(subscribed, HttpStatus.OK);
	}

	@GetMapping(value = "/subscribe/{id}")
	@PreAuthorize("hasRole('ROLE_CLIENT')")
	public ResponseEntity<Boolean> subscribe(@RequestHeader("Authorization") String token, @PathVariable Integer id) {
		String email = tokenUtils.getEmailFromToken(token.split(" ")[1]);
		Client client = clientService.findByEmail(email);
		boolean subscribeSuccess = clientService.subscribe(client, id);
		return new ResponseEntity<>(subscribeSuccess, HttpStatus.OK);
	}

	@GetMapping(value = "/unsubscribe/{id}")
	@PreAuthorize("hasRole('ROLE_CLIENT')")
	public ResponseEntity<Boolean> unsubscribe(@RequestHeader("Authorization") String token, @PathVariable Integer id) {
		String email = tokenUtils.getEmailFromToken(token.split(" ")[1]);
		Client client = clientService.findByEmail(email);
		boolean unsubscribeSuccess = clientService.unsubscribe(client, id);
		return new ResponseEntity<>(unsubscribeSuccess, HttpStatus.OK);
	}
	
	@GetMapping(value = "/subscriptions")
	@PreAuthorize("hasRole('ROLE_CLIENT')")
	public ResponseEntity<List<SubscriptionDto>> getLoggedInClient(@RequestHeader("Authorization") String token) {
		String email = tokenUtils.getEmailFromToken(token.split(" ")[1]);
		Client client = clientService.findByEmail(email);
		List<SubscriptionDto> subscriptionDtos = new ArrayList<>();
		for(ServiceProfile s : clientService.getClientSubscriptions(client)){
			SubscriptionDto dto = new SubscriptionDto();
			dto.setId(s.getId());
			dto.setName(s.getName());
			dto.setDescription(s.getDescription());
			dto.setRating(s.getRating());
			dto.setLocation(s.getLocation());
			for(Image image : s.getImages()){
				if(image.isCoverImage()) {
					dto.setImagePath(image.getPath());
					break;
				}
			}
			subscriptionDtos.add(dto);
		}
		return new ResponseEntity<>(subscriptionDtos, HttpStatus.OK);
	}



}
