package isa.FishingAdventure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isa.FishingAdventure.repository.ClientRepository;

@Service
public class ClientService{
	
	@Autowired
	private ClientRepository clientRepository;
}
