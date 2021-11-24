package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
