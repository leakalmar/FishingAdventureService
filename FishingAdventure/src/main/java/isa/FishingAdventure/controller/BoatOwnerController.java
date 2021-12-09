package isa.FishingAdventure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isa.FishingAdventure.service.BoatOwnerService;

@RestController
@RequestMapping(value = "boatOwner")
public class BoatOwnerController {
	
	@Autowired
	private BoatOwnerService boatOwnerService;
}
