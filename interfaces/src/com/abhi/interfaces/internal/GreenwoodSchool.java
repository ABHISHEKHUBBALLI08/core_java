package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.School;

public class GreenwoodSchool implements School {

    @Override
    public void attendClasses() {
        System.out.println("Attending classes at Greenwood School.");
    }

    @Override
    public void submitAssignments() {
        System.out.println("Submitting assignments at Greenwood School.");
    }

    @Override
    public void participateInSports() {
        System.out.println("Participating in sports at Greenwood School.");
    }

    @Override
    public void attendParentTeacherMeet() {
        System.out.println("Attending Parent-Teacher meet at Greenwood School.");
    }

    @Override
    public void joinClubs() {
        System.out.println("Joining clubs at Greenwood School.");
    }

    @Override
    public void takeExams() {
        System.out.println("Taking exams at Greenwood School.");
    }

    @Override
    public void getReportCard() {
        System.out.println("Getting report card from Greenwood School.");
    }
}
