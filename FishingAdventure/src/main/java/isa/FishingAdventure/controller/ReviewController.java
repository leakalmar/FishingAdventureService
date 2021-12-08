package isa.FishingAdventure.controller;

import isa.FishingAdventure.service.ReviewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "review")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
}
