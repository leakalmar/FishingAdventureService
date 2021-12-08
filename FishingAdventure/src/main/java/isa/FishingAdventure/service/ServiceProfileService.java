package isa.FishingAdventure.service;

import isa.FishingAdventure.repository.ServiceProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceProfileService {
	
	@Autowired
	private ServiceProfileRepository profileRepository;
}
