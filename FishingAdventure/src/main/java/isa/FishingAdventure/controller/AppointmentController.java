package isa.FishingAdventure.controller;

import isa.FishingAdventure.service.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "appointment")
public class AppointmentController{
	
	@Autowired
	private AppointmentService appointmentService;
}