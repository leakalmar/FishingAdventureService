package isa.FishingAdventure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isa.FishingAdventure.repository.VacationHomeOwnerRepository;

@Service
public class VacationHomeOwnerService{
	
	@Autowired
	private VacationHomeOwnerRepository homeOwnerRepository;
}
