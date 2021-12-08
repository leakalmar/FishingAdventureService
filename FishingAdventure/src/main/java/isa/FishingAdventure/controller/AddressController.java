package isa.FishingAdventure.controller;

import isa.FishingAdventure.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
}
