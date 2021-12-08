package isa.FishingAdventure.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
public class FishingAdventure extends ServiceProfile {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fishingAdventureId")
    public FishingInstructor fishingInstructor;

    public FishingAdventure() {
    }


    public FishingAdventure(Integer serviceId, String name, String description, double cancellationRule, double rating, Location location,
                            Set<Appointment> appointments, Set<Rule> rules, Set<AdditionalService> additionalServices) {
        super(serviceId, name, description, cancellationRule, rating, location, appointments, rules, additionalServices);
    }

    public FishingInstructor getFishingInstructor() {
        return fishingInstructor;
    }

    public void setFishingInstructor(FishingInstructor fishingInstructor) {
        this.fishingInstructor = fishingInstructor;
    }
}