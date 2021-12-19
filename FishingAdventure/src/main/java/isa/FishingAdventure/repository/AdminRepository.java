package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends UserRepository{

    Admin findByEmail(String email);
}
