package isa.FishingAdventure.controller;

import isa.FishingAdventure.service.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "room")
public class RoomController {
	
	@Autowired
	private RoomService roomService;
}
