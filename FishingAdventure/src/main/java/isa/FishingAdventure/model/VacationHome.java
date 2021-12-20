package isa.FishingAdventure.model;

import javax.persistence.*;

import isa.FishingAdventure.dto.NewHomeDto;
import isa.FishingAdventure.dto.VacationHomeDto;

import java.util.Date;
import java.util.Set;

@Entity
public class VacationHome extends ServiceProfile {

    @Column(name = "availabilityStart", nullable = false)
    private Date availabilityStart;

    @Column(name = "availabilityEnd", nullable = false)
    private Date availabilityEnd;

    @ManyToOne(targetEntity = VacationHomeOwner.class,cascade = CascadeType.MERGE)
    public VacationHomeOwner vacationHomeOwner;

    @OneToMany(targetEntity = Room.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public Set<Room> rooms;

    public VacationHome(int id, String name, String description, double cancellationRule, double rating, Location location, Set<Appointment> appointments, Set<Rule> rules, Set<AdditionalService> additionalServices) {
        super(id, name, description, cancellationRule, rating, location, appointments, rules, additionalServices);
    }

    public VacationHome() {
    }

    public Date getAvailabilityStart() {
        return this.availabilityStart;
    }

    public void setAvailabilityStart(Date availabilityStart) {
        this.availabilityStart = availabilityStart;
    }

    public Date getAvailabilityEnd() {
        return this.availabilityEnd;
    }

    public void setAvailabilityEnd(Date availabilityEnd) {
        this.availabilityEnd = availabilityEnd;
    }


	public VacationHomeOwner getVacationHomeOwner() {
		return vacationHomeOwner;
	}


	public void setVacationHomeOwner(VacationHomeOwner vocationHomeOwner) {
		this.vacationHomeOwner = vocationHomeOwner;
	}


	public Set<Room> getRooms() {
		return rooms;
	}


	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	} 
}