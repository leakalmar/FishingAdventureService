package isa.FishingAdventure.repository;

import isa.FishingAdventure.model.AvailabilityDateRange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.LockModeType;
import javax.persistence.QueryHint;

@Repository
public interface AvailabilityDateRangeRepository extends JpaRepository<AvailabilityDateRange, Integer> {

    @Lock(LockModeType.PESSIMISTIC_READ)
    @QueryHints({ @QueryHint(name = "javax.persistence.lock.timeout", value = "0") })
    List<AvailabilityDateRange> getAllByServiceProfileId(Integer id);
}
