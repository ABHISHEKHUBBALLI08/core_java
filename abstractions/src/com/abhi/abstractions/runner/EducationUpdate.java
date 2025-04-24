package com.abhi.abstractions.runner;

import com.abhi.abstractions.internal.Education;

public class EducationUpdate {
    private Education education;

    public EducationUpdate(Education education) {
        this.education = education;
        System.out.println("Education instance initialized...");
    }

    public void educationInfo() {
        if (this.education != null) {
            this.education.info();
        } else {
            System.out.println("Education is null");
        }
    }
}
