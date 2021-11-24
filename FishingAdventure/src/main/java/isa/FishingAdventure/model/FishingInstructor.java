package isa.FishingAdventure.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class FishingInstructor extends User {

    @Column(name = "biography", nullable = false)
    private String biography;

    @OneToMany(mappedBy = "fishingInstructor", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<FishingAdventure> fishingAdventures = new HashSet<FishingAdventure>();

    public FishingInstructor(Integer userId, String email, String password, String name, String surname, String phoneNumber,
                             UserType userType, double points, UserCategory category, boolean activated, Address address) {
        super(userId, email, password, name, surname, phoneNumber, userType, points, category, activated, address);
    }

    public FishingInstructor() {
    }

    public String getBiography() {
        return this.biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Set<FishingAdventure> getFishingAdventures() {
        return fishingAdventures;
    }

    public void setFishingAdventures(Set<FishingAdventure> fishingAdventures) {
        this.fishingAdventures = fishingAdventures;
    }
}