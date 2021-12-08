package isa.FishingAdventure.service;

import isa.FishingAdventure.repository.UserCatagoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCatagoryService {
	
	@Autowired
	private UserCatagoryRepository catagoryRepository;
}
