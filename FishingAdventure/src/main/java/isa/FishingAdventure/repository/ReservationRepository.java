package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
