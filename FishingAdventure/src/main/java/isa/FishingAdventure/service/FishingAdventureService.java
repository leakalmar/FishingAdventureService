package isa.FishingAdventure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isa.FishingAdventure.repository.FishingAdventureRepository;

@Service
public class FishingAdventureService{
	
	@Autowired
	private FishingAdventureRepository adventureRepository;
}
