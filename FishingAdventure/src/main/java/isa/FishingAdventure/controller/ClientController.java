package isa.FishingAdventure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isa.FishingAdventure.service.ClientService;

@RestController
@RequestMapping(value = "client")
public class ClientController{
	
	@Autowired
	private ClientService clientService;
}
