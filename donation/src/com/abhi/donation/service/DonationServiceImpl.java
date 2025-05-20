package com.abhi.donation.service;

import com.abhi.donation.dto.DonationDto;

public class DonationServiceImpl implements DonationService{


    @Override
    public boolean save(DonationDto donationDto) {
            System.out.println("executed save method");
            return true;


    }
}
