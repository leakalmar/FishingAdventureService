package isa.FishingAdventure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import isa.FishingAdventure.model.AdvertiserEarnings;

@Repository
public interface AdvertiserEarningsRepository extends JpaRepository<AdvertiserEarnings, Integer> {

}
