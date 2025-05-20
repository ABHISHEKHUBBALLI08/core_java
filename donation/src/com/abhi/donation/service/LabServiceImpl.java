package com.abhi.donation.service;

import com.abhi.donation.dto.LaboratoryDto;

public class LabServiceImpl implements LabService{
    @Override
    public boolean save(LaboratoryDto laboratoryDto) {
        System.out.println("save method executed successfully");
        return true;
    }
}
