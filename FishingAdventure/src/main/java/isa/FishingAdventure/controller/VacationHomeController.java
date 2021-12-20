package isa.FishingAdventure.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import isa.FishingAdventure.model.*;
import isa.FishingAdventure.service.VacationHomeOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import isa.FishingAdventure.dto.NewHomeDto;
import isa.FishingAdventure.dto.VacationHomeDto;
import isa.FishingAdventure.service.VacationHomeService;
@RestController
@Configurable
@RequestMapping(value = "/vacationHome", produces = MediaType.APPLICATION_JSON_VALUE)
public class VacationHomeController {

	@Autowired
	private VacationHomeService homeService;

	@Autowired
	private VacationHomeOwnerService homeOwnerService;

	@GetMapping(value = "/all")
	public ResponseEntity<List<VacationHomeDto>> getAllVacationHomes() {
		List<VacationHome> vacationHomes = homeService.findAll();

		List<VacationHomeDto> VacationHomeDto = new ArrayList<>();
		for (VacationHome h : vacationHomes) {
			VacationHomeDto dto = new VacationHomeDto(h);
			VacationHomeDto.add(dto);
		}

		return new ResponseEntity<>(VacationHomeDto, HttpStatus.OK);
	}

	@GetMapping(value = "/all/{email}")
	@PreAuthorize("hasRole('ROLE_VACATION_HOME_OWNER')")
	public ResponseEntity<List<NewHomeDto>> getAllVacationHomesByEmail(@PathVariable String email) {
		VacationHomeOwner owner = homeOwnerService.findByEmail(email);

		List<NewHomeDto> vacationHomes = new ArrayList<NewHomeDto>();
		for (VacationHome home: homeService.findByVacationHomeOwner(owner)){
			vacationHomes.add(new NewHomeDto(home));
		}

		return new ResponseEntity<>(vacationHomes, HttpStatus.OK);
	}

	@PostMapping(value = "/newHome")
	@PreAuthorize("hasRole('ROLE_VACATION_HOME_OWNER')")
	public ResponseEntity<NewHomeDto> saveNewCottage(@RequestBody NewHomeDto dto) {
		VacationHomeOwner owner = homeOwnerService.findByEmail(dto.getVacationHomeOwner());
		VacationHome home = new VacationHome();

		home.setAvailabilityEnd(new Date());
		home.setAvailabilityStart(new Date());
		home.setDescription(dto.getDescription());
		home.setLocation(dto.getLocation());
		home.setAdditionalServices(dto.getAdditionalServices());
		home.setAppointments(new HashSet<Appointment>());
		home.setCancellationRule(dto.getCancellationRule());
		home.setImages(new HashSet<Image>());
		home.setName(dto.getName());
		home.setRating(0.0);
		home.setRooms(dto.getRooms());
		home.setRules(dto.getRules());
		home.setVacationHomeOwner(owner);

		homeService.save(home);

		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

	@GetMapping(value = "/deleteHome/{id}")
	@PreAuthorize("hasRole('ROLE_VACATION_HOME_OWNER')")
	public ResponseEntity<String> deleteVacationHome(@PathVariable String id) {
		homeService.delete(Integer.parseInt(id));

		return new ResponseEntity<>("ok", HttpStatus.OK);
	}
}

	

	

		

		

		

	

		