package isa.FishingAdventure.controller;

import isa.FishingAdventure.service.RuleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "rule")
public class RuleController {
	
	@Autowired
	private RuleService ruleService;
}
