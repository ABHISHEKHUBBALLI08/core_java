package com.abhi.donation.service;

import com.abhi.donation.dto.FeedbackDto;

public class FeedbackServiceImpl implements FeedbackService{
    @Override
    public boolean save(FeedbackDto feedbackDto) {
        System.out.println("executed save method successfully");
        return true;
    }
}
