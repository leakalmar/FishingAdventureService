package isa.FishingAdventure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isa.FishingAdventure.repository.NavigationEquipmentRepository;


@Service
public class NavigationEquipmentService {
	
	@Autowired
	private NavigationEquipmentRepository equipmentRepository;
}
