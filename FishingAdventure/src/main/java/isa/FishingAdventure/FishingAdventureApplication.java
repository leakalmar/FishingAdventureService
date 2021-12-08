package isa.FishingAdventure;

import isa.FishingAdventure.model.Room;
import isa.FishingAdventure.repository.*;
import isa.FishingAdventure.service.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.MailException;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class FishingAdventureApplication{

	@Autowired
	private AddressRespository addressRespository;

	@Autowired
	private AdditionalServiceRepository additionalServiceRepository;

	@Autowired
	private AppointmentRepository appointmentRepository;

	@Autowired
	private FishingEquipmentRepository fishingEquipmentRepository;

	@Autowired
	private ImageRepository imageRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Autowired
	private NavigationEquipmentRepository navigationEquipmentRepository;

	@Autowired
	private ReservationReportRepository reservationReportRepository;

	@Autowired
	private ReservationRepository reservationRepository;


	@Autowired
	private ReviewRepository reviewRepository;


	@Autowired
	private RoomRepository roomRepository;

	@Autowired
	private RuleRepository ruleRepository;

	@Autowired
	private ServiceProfileRepository serviceProfileRepository;

	@Autowired
	private UserCatagoryRepository userCatagoryRepository;

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EmailService emailService;


	public static void main(String[] args) {
		SpringApplication.run(FishingAdventureApplication.class, args);
	}
}
