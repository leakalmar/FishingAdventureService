package isa.FishingAdventure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import isa.FishingAdventure.repository.AdvertiserEarningsRepository;

@Service
public class AdvertiserEarningsService {

    @Autowired
    private AdvertiserEarningsRepository advertiserEarningsRepository;
}
