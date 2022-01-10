package isa.FishingAdventure.dto;

import isa.FishingAdventure.model.*;

import java.util.Set;

public class NewAdventureDto {
    private Integer id;

    private String name;

    private String description;

    private double cancellationRule;

    private double rating;

    private Location location;

    private Set<Rule> rules;

    private Set<AdditionalService> additionalServices;

    private Set<Image> images;

    private FishingInstructor fishingInstructor;

    private String imagePath;

    private int persons;

    private double price;

    private float duration;

    private boolean hasAppointments;

    public NewAdventureDto() { }

    public NewAdventureDto(Integer id, String name, String description, double cancellationRule, double rating,
                           Location location, Set<Rule> rules, FishingInstructor fishingInstructor, String imagePath,
                           int persons, double price, float duration) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cancellationRule = cancellationRule;
        this.rating = rating;
        this.location = location;
        this.rules = rules;
        this.fishingInstructor = fishingInstructor;
        this.imagePath = imagePath;
        this.persons = persons;
        this.price = price;
        this.duration = duration;
    }

    public NewAdventureDto(FishingAdventure adventure) {
        this.id = adventure.getId();
        this.name = adventure.getName();
        this.description = adventure.getDescription();
        this.cancellationRule = adventure.getCancellationRule();
        this.rating = adventure.getRating();
        this.location = adventure.getLocation();
        this.rules = adventure.getRules();
        this.images = adventure.getImages();
        this.fishingInstructor = adventure.getFishingInstructor();
        this.persons = adventure.getPersons();
        this.price = adventure.getPricePerDay();
        this.additionalServices = adventure.getAdditionalServices();
        this.duration = adventure.getAdventureDuration().toMinutes();
        for (Image img : adventure.getImages()) {
            if (img.isCoverImage()) {
                this.imagePath = img.getPath();
                break;
            }
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCancellationRule() {
        return cancellationRule;
    }

    public void setCancellationRule(double cancellationRule) {
        this.cancellationRule = cancellationRule;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Set<Rule> getRules() {
        return rules;
    }

    public void setRules(Set<Rule> rules) {
        this.rules = rules;
    }

    public Set<AdditionalService> getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(Set<AdditionalService> additionalServices) {
        this.additionalServices = additionalServices;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    public FishingInstructor getFishingInstructor() {
        return fishingInstructor;
    }

    public void setFishingInstructor(FishingInstructor fishingInstructor) {
        this.fishingInstructor = fishingInstructor;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public boolean isHasAppointments() {
        return hasAppointments;
    }

    public void setHasAppointments(boolean hasAppointments) {
        this.hasAppointments = hasAppointments;
    }
}
