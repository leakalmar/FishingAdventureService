package isa.FishingAdventure.controller;

import isa.FishingAdventure.service.LocationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "location")
public class LocationController {
	
	@Autowired
	private LocationService locationService;
}
