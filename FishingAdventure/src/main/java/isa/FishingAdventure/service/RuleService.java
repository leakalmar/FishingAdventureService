package isa.FishingAdventure.service;

import isa.FishingAdventure.repository.RuleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleService {
	
	@Autowired
	private RuleRepository repository;
}
