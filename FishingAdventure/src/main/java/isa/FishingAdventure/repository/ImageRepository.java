package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
}
