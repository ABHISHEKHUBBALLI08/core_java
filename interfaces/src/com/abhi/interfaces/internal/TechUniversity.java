package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.College;

public class TechUniversity implements College {

    @Override
    public void attendLectures() {
        System.out.println("Attending lectures at Tech University.");
    }

    @Override
    public void submitProjects() {
        System.out.println("Submitting projects at Tech University.");
    }

    @Override
    public void participateInSeminars() {
        System.out.println("Participating in seminars at Tech University.");
    }

    @Override
    public void joinInternships() {
        System.out.println("Joining internships at Tech University.");
    }

    @Override
    public void attendWorkshops() {
        System.out.println("Attending workshops at Tech University.");
    }

    @Override
    public void appearForExams() {
        System.out.println("Appearing for exams at Tech University.");
    }

    @Override
    public void receiveDegree() {
        System.out.println("Receiving degree from Tech University.");
    }
}
