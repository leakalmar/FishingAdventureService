package isa.FishingAdventure.dto;

import java.util.Date;

import isa.FishingAdventure.model.Image;
import isa.FishingAdventure.model.Location;
import isa.FishingAdventure.model.VacationHome;
import isa.FishingAdventure.model.VacationHomeOwner;

public class VacationHomeDto {
	
	private int id;
	
	private String name;
	
	private String description;
	
	private double rating;
	
	private Location location;

	private String imagePath;
	
	private Date availabilityStart;
	
	private Date availabilityEnd;

	private VacationHomeOwner vacationHomeOwner;
	
	public VacationHomeDto(int id, String name, String description, double rating, Location location, String imagePath, Date availabilityStart, Date availabilityEnd,
			VacationHomeOwner vocationHomeOwner) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.rating = rating;
		this.location = location;
		this.imagePath = imagePath;
		this.availabilityStart = availabilityStart;
		this.availabilityEnd = availabilityEnd;
		this.vacationHomeOwner = vocationHomeOwner;
	}

	public VacationHomeDto(VacationHome home) {
		this.id = home.getServiceId();
		this.name = home.getName();
		this.description = home.getDescription();
		this.rating = home.getRating();
		this.location = home.getLocation();
		for(Image img : home.getImages()) {
			this.imagePath = img.getPath();
			break;
		}
		this.availabilityStart = home.getAvailabilityStart();
		this.availabilityEnd = home.getAvailabilityEnd();
		this.vacationHomeOwner = home.getVacationHomeOwner();
	}

	public VacationHomeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public void setVacationHomeOwner(VacationHomeOwner vacationHomeOwner) {
		this.vacationHomeOwner = vacationHomeOwner;
	}
}
