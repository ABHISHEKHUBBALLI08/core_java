package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.ExamPortal;

public class VTUExamPortal implements ExamPortal {

    @Override
    public void registerForExam() {
        System.out.println("Registering for exam on VTU Exam Portal.");
    }

    @Override
    public void viewTimetable() {
        System.out.println("Viewing timetable on VTU Exam Portal.");
    }

    @Override
    public void downloadAdmitCard() {
        System.out.println("Downloading admit card from VTU Exam Portal.");
    }

    @Override
    public void viewResults() {
        System.out.println("Viewing results on VTU Exam Portal.");
    }

    @Override
    public void applyForRevaluation() {
        System.out.println("Applying for revaluation on VTU Exam Portal.");
    }

    @Override
    public void getExamNotifications() {
        System.out.println("Getting exam notifications on VTU Exam Portal.");
    }

    @Override
    public void requestExamTranscripts() {
        System.out.println("Requesting exam transcripts on VTU Exam Portal.");
    }
}
