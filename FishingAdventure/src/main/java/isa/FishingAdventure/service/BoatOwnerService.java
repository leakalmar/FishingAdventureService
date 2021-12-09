package isa.FishingAdventure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import isa.FishingAdventure.dto.UserDto;
import isa.FishingAdventure.model.BoatOwner;
import isa.FishingAdventure.model.UserType;
import isa.FishingAdventure.repository.BoatOwnerRepository;

@Service
public class BoatOwnerService {

	@Autowired
	private BoatOwnerRepository boatOwnerRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserTypeService userTypeService;

	public BoatOwner findByEmail(String email) {
		return (BoatOwner)boatOwnerRepository.findByEmail(email);
	}
	
	public BoatOwner save(UserDto userDto) {
		BoatOwner u = new BoatOwner();
		u.setEmail(userDto.getEmail());

		u.setPassword(passwordEncoder.encode(userDto.getPassword()));
		u.setName(userDto.getName());
		u.setSurname(userDto.getSurname());
		u.setPhoneNumber(userDto.getPhoneNumber());
		u.setEmail(userDto.getEmail());
		u.setAddress(userDto.getAddress());

		
		List<UserType> roles = userTypeService.findByName("ROLE_BOAT_OWNER");
		u.setUserType(roles.get(0));
		u.setPoints(0.0);
		
		return this.boatOwnerRepository.save(u);
	} 
}
