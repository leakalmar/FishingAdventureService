package isa.FishingAdventure.service;

import isa.FishingAdventure.model.AvailabilityDateRange;
import isa.FishingAdventure.model.ServiceProfile;
import isa.FishingAdventure.repository.AvailabilityDateRangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvailabilityDateRangeService {

    @Autowired
    private AvailabilityDateRangeRepository repository;

    public List<AvailabilityDateRange> getAllByServiceProfileId(int id) {
        return repository.getAllByServiceProfileId(id);
    }

    public AvailabilityDateRange getById(int id) {
        return repository.getById(id);
    }

    public AvailabilityDateRange save(AvailabilityDateRange date) {
        return repository.save(date);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public List<AvailabilityDateRange> findByServiceProfile(ServiceProfile serviceProfile){
        return repository.findByServiceProfile(serviceProfile);
    }
}
