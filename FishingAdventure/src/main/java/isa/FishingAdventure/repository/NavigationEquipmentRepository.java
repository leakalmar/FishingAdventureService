package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.NavigationEquipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NavigationEquipmentRepository extends JpaRepository<NavigationEquipment, Integer> {
}
