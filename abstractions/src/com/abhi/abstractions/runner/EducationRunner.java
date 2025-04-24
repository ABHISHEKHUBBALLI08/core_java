package com.abhi.abstractions.runner;

import com.abhi.abstractions.internal.Education;
import com.abhi.abstractions.internal.School;
import com.abhi.abstractions.internal.College;

public class EducationRunner {
    public static void main(String[] args) {
        Education school = new School();
        Education college = new College();
        EducationUpdate update1 = new EducationUpdate(school);
        update1.educationInfo();
        EducationUpdate update2 = new EducationUpdate(college);
        update2.educationInfo();
    }
}
