package isa.FishingAdventure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isa.FishingAdventure.service.AdminService;

@RestController
@RequestMapping(value = "admin")
public class AdminController{
	
	@Autowired
	private AdminService adminService;
}
