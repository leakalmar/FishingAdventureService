package isa.FishingAdventure.dto;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import isa.FishingAdventure.model.*;


public class NewHomeDto {

	private Integer id;

    private String name;

    private String description;

    private double cancellationRule;

    private double rating;

    public Location location;

    private Set<Rule> rules;

    private Set<AdditionalService> additionalServices;
    
    public Set<Image> images;
    
    public Set<Room> rooms;

	private Date availabilityStart;

	private Date availabilityEnd;

	public VacationHomeOwner vacationHomeOwner;

	public String imagePath;

	public Set<Room> getRooms() {
		return rooms;
	}

	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

	public NewHomeDto(Integer id, String name, String description, double cancellationRule, double rating, Location location,
			Set<Rule> rules, Set<AdditionalService> additionalServices,
			Set<Image> images, Set<Room> rooms, Date availabilityStart, Date availabilityEnd,
					  VacationHomeOwner vocationHomeOwner, String imagePath) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.cancellationRule = cancellationRule;
		this.rating = rating;
		this.location = location;
		this.rules = rules;
		this.additionalServices = additionalServices;
		this.images = images;
		this.rooms = rooms;
		this.availabilityStart = availabilityStart;
		this.availabilityEnd = availabilityEnd;
		this.vacationHomeOwner = vocationHomeOwner;
		this.imagePath = imagePath;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
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

	public Date getAvailabilityStart() {
		return availabilityStart;
	}

	public void setAvailabilityStart(Date availabilityStart) {
		this.availabilityStart = availabilityStart;
	}

	public Date getAvailabilityEnd() {
		return availabilityEnd;
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

	public NewHomeDto() {
		super();
	}

	public NewHomeDto(VacationHome home) {
		this.id = home.getId();
		this.name = home.getName();
		this.cancellationRule = home.getCancellationRule();
		this.location = home.getLocation();
		this.rules = home.getRules();
		this.additionalServices = home.getAdditionalServices();
		this.images = home.getImages();
		this.rooms = home.getRooms();
		this.description = home.getDescription();
		this.rating = home.getRating();
		for(Image img : home.getImages()) {
			this.imagePath = img.getPath();
			break;
		}
		this.availabilityStart = home.getAvailabilityStart();
		this.availabilityEnd = home.getAvailabilityEnd();
		this.vacationHomeOwner = home.getVacationHomeOwner();
	}
}
