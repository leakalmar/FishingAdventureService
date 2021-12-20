package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.BoatOwner;
import org.springframework.stereotype.Repository;

@Repository
public interface BoatOwnerRepository extends UserRepository{

    BoatOwner save(BoatOwner boatOwner);
    BoatOwner findByEmail(String email);
}
