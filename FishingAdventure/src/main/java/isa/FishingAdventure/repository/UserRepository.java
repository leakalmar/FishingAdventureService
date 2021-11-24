package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
