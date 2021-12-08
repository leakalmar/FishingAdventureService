package isa.FishingAdventure.service;
import isa.FishingAdventure.model.AdditionalService;
import isa.FishingAdventure.repository.AdditionalServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class AdditionalServiceService {
	
	@Autowired
	private AdditionalServiceRepository additionalServiceRepository;
}
