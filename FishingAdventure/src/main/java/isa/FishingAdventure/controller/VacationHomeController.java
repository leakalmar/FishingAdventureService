package isa.FishingAdventure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isa.FishingAdventure.service.VacationHomeService;

@RestController
@RequestMapping(value = "vacationHome")
public class VacationHomeController{
	
	@Autowired
	private VacationHomeService  homeService;
}
