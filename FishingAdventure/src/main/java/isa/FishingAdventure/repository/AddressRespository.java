package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRespository extends JpaRepository<Address, Integer> {
}
