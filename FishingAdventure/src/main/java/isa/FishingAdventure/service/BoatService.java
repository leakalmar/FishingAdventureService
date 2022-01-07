package isa.FishingAdventure.service;

import isa.FishingAdventure.dto.AppointmentDto;
import isa.FishingAdventure.model.Appointment;
import isa.FishingAdventure.model.Boat;
import isa.FishingAdventure.model.BoatOwner;
import isa.FishingAdventure.model.Image;
import isa.FishingAdventure.repository.BoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BoatService {

    @Autowired
    private BoatRepository boatRepository;

    @Autowired
    private BoatOwnerService ownerService;

    public List<Boat> findAll() {
        return boatRepository.findAll();
    }

    public List<Boat> findByBoatOwner(BoatOwner owner) {
        List<Boat> boats = new ArrayList<Boat>();
        for (Boat boat : boatRepository.findByBoatOwner(owner)) {
            if (!boat.getDeleted()) {
                boats.add(boat);
            }
        }
        return boats;
    }

    public void save(Boat boat) {
        boatRepository.save(boat);
    }

    public Boat getById(int id) {
        return boatRepository.getById(id);
    }

    public boolean exists(Integer id) {
        return boatRepository.findById(id).isPresent();
    }

    public List<AppointmentDto> getOffersByAdvertiser(String email) {
        BoatOwner owner = ownerService.findByEmail(email);

        List<AppointmentDto> appointmentDtos = new ArrayList<>();
        for (Boat boat : findByBoatOwner(owner)) {
            appointmentDtos.addAll(getAppointmentDtos(boat));
        }
        return appointmentDtos;
    }

    public List<AppointmentDto> getAppointmentDtos(Boat boat) {
        List<AppointmentDto> appointmentDtos = new ArrayList<>();
        for (Appointment appointment : boat.getAppointments()) {
            if (!appointment.isReserved() && appointment.getEndDate().after(new Date())) {
                AppointmentDto dto = new AppointmentDto(appointment);
                dto.setServiceProfileName(boat.getName());
                dto.setServiceProfileId(boat.getId());
                for (Image img : boat.getImages()) {
                    if (img.isCoverImage()) {
                        dto.setCoverImage(img.getPath());
                        break;
                    }
                }
                appointmentDtos.add(dto);
            }
        }
        return appointmentDtos;
    }
}
