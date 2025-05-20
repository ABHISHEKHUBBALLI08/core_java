package com.abhi.donation.service;

import com.abhi.donation.dto.LicenseDto;

public class LicenseServiceImpl implements LicenseService{
    @Override
    public boolean save(LicenseDto licenseDto) {
        System.out.println("save method executed successfully");
        return true;
    }
}
