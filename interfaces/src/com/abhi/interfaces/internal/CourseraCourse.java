package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.OnlineCourse;

public class CourseraCourse implements OnlineCourse {

    @Override
    public void watchLectures() {
        System.out.println("Watching lectures on Coursera.");
    }

    @Override
    public void participateInDiscussions() {
        System.out.println("Participating in discussions on Coursera.");
    }

    @Override
    public void completeAssignments() {
        System.out.println("Completing assignments on Coursera.");
    }

    @Override
    public void takeQuizzes() {
        System.out.println("Taking quizzes on Coursera.");
    }

    @Override
    public void submitProjects() {
        System.out.println("Submitting projects on Coursera.");
    }

    @Override
    public void earnCertificate() {
        System.out.println("Earning certificate from Coursera.");
    }

    @Override
    public void attendWebinars() {
        System.out.println("Attending webinars on Coursera.");
    }
}
