package isa.FishingAdventure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isa.FishingAdventure.repository.AdminRepository;

@Service
public class AdminService{
	
	@Autowired
	private AdminRepository adminRepository;
}
