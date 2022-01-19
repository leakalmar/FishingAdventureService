package isa.FishingAdventure.dto;

import isa.FishingAdventure.model.Location;

public class SubscriptionDto {

    private Integer id;

    private String name;

    private Boolean isDeleted;

    private String description;

    private double cancellationRule;

    private double rating;

    private Location location;

    private String imagePath;

    public SubscriptionDto(Integer id, String name, Boolean isDeleted, String description, double cancellationRule,
            double rating, Location location, String imagePath) {
        this.id = id;
        this.name = name;
        this.isDeleted = isDeleted;
        this.description = description;
        this.cancellationRule = cancellationRule;
        this.rating = rating;
        this.location = location;
        this.imagePath = imagePath;
    }

    public SubscriptionDto() {
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

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
