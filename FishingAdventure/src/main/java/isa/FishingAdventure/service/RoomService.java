package isa.FishingAdventure.service;

import isa.FishingAdventure.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
	
	@Autowired
	private RoomRepository repository;
}
