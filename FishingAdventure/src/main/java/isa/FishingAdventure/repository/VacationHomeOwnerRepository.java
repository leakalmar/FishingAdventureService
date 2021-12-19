package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.VacationHomeOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacationHomeOwnerRepository extends JpaRepository<VacationHomeOwner, Integer> {

    VacationHomeOwner findByEmail(String email);
}
