package isa.FishingAdventure.service;

import isa.FishingAdventure.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository repository;
}
