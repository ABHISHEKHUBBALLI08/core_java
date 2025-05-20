package com.abhi.donation.service;

import com.abhi.donation.dto.FirDto;

public class FirServiceImpl implements FirService{
    @Override
    public boolean save(FirDto firDto) {
        System.out.println("saved method executed successfully");
        return true;
    }
}
