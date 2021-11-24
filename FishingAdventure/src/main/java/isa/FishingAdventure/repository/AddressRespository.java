package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRespository extends JpaRepository<Address, Integer> {
}
