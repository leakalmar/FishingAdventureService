package isa.FishingAdventure.service;

import isa.FishingAdventure.repository.ReservationReportRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationReportService {
	
	@Autowired
	private ReservationReportRepository reportRepository;
}
