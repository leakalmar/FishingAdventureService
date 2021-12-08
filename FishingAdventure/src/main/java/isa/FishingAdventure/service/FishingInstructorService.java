package isa.FishingAdventure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isa.FishingAdventure.repository.FishingInstructorRepository;

@Service
public class FishingInstructorService{
	
	@Autowired
	private FishingInstructorRepository fishingInstructorRepository;
}
