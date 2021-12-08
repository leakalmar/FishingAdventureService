package isa.FishingAdventure.controller;

import isa.FishingAdventure.service.FishingEquipmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "fishingEquipment")
public class FishingEquipmentController {
	
	@Autowired
	private FishingEquipmentService equipmentService;
}
