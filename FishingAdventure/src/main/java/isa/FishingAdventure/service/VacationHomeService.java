package isa.FishingAdventure.service;

import isa.FishingAdventure.model.VacationHome;
import isa.FishingAdventure.model.VacationHomeOwner;
import isa.FishingAdventure.repository.VacationHomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class VacationHomeService {

    @Autowired
    private VacationHomeRepository homeRepository;

    public List<VacationHome> findAllNonDeleted() {
        List<VacationHome> homes = new ArrayList<VacationHome>();
        for (VacationHome home : homeRepository.findAll()) {
            if (!home.getDeleted()) {
                homes.add(home);
            }
        }
        return homes;
    }

    public List<VacationHome> findByVacationHomeOwner(VacationHomeOwner owner) {
        List<VacationHome> homes = new ArrayList<VacationHome>();
        for (VacationHome home : homeRepository.findByVacationHomeOwner(owner)) {
            if (!home.getDeleted()) {
                homes.add(home);
            }
        }
        return homes;
    }

    public VacationHome save(VacationHome home) {
        return homeRepository.save(home);
    }

    public VacationHome getById(int id) {
        return homeRepository.getById(id);
    }

    public List<VacationHome> findAllAvailableVacationHomes(Date start, Date end, int persons) {
//        boolean available = true;
//        ArrayList<VacationHome> availableVacationHomes = new ArrayList<VacationHome>();
//        for(VacationHome vh : findAllNonDeleted()){
//            available = true;
//            if (start.after(vh.getAvailabilityStart()) && start.before(vh.getAvailabilityEnd()) && end.before(vh.getAvailabilityEnd())
//                && persons <= vh.getPersons()){
//                for(Appointment ap : vh.getAppointments()){
//                    if(start.after(ap.getStartDate()) || start.before(ap.getEndDate()) || end.before(ap.getEndDate())) {
//                        available = false;
//                        break;
//                    }
//                    System.out.println("Ovde");
//                }
//            } else{
//                available = false;
//            }
//            System.out.println(available);
//            if(available)
//                availableVacationHomes.add(vh);
//        }
//
//        return availableVacationHomes;
        return new ArrayList<>();
    }
}
