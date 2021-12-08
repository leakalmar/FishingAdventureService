package isa.FishingAdventure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import isa.FishingAdventure.repository.BoatRepository;

@Service
public class BoatService {
	
	@Autowired
	private BoatRepository boatRepository;
}
