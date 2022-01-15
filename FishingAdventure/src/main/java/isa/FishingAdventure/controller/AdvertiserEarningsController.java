package isa.FishingAdventure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isa.FishingAdventure.service.AdvertiserEarningsService;

@RestController
@RequestMapping(value = "advertisErearnings")
public class AdvertiserEarningsController {

    @Autowired
    private AdvertiserEarningsService advertiserEarningsService;

}
