package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.ReservationReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationReportRepository extends JpaRepository<ReservationReport, Integer> {
}
