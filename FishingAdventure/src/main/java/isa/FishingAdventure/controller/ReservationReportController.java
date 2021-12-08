package isa.FishingAdventure.controller;

import isa.FishingAdventure.service.ReservationReportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "reservationReport")
public class ReservationReportController {
	
	@Autowired
	private ReservationReportService reportService;
}
