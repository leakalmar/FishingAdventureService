package isa.FishingAdventure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isa.FishingAdventure.service.VacationHomeOwnerService;

@RestController
@RequestMapping(value = "vacationHomeOwner")
public class VacationHomeOwnerController{
	
	@Autowired
	private VacationHomeOwnerService homeOwnerService;
}
