package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.FishingEquipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FishingEquipmentRepository extends JpaRepository<FishingEquipment, Integer> {
}
