package isa.FishingAdventure.controller;

import isa.FishingAdventure.service.ImageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "image")
public class ImageController {
	
	@Autowired
	private ImageService imageService;
}
