package isa.FishingAdventure.repository;

import isa.FishingAdventure.dto.UserDto;
import org.springframework.stereotype.Repository;

import isa.FishingAdventure.model.FishingInstructor;

@Repository
public interface FishingInstructorRepository extends UserRepository{
	
	FishingInstructor findByEmail(String email);

	FishingInstructor save(FishingInstructor fishingInstructor);
}
