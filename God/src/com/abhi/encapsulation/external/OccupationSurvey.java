package com.abhi.encapsulation.external;

import com.abhi.encapsulation.internal.Occupation;

public class OccupationSurvey {
    public void surveyResults() {
        System.out.println(" occupations are surveyed every year");
        Occupation occupation = new Occupation();
        occupation.getOccupationId();
        occupation.getTitle();
        occupation.getField();
        occupation.getLocation();
        occupation.getExperience();
    }
}
