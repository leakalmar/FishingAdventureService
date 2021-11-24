package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
