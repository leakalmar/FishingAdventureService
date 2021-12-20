package isa.FishingAdventure.repository;

import org.springframework.stereotype.Repository;

import isa.FishingAdventure.dto.UserDto;
import isa.FishingAdventure.model.Client;

@Repository
public interface ClientRepository extends UserRepository{

	Client save(Client client);

	Client findByEmail(String email);
}
