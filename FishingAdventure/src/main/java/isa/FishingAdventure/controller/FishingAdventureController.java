package isa.FishingAdventure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isa.FishingAdventure.service.FishingAdventureService;

@RestController
@RequestMapping(value = "fishingAdventure")
public class FishingAdventureController{
	
	@Autowired
	private FishingAdventureService adventureService;
}
