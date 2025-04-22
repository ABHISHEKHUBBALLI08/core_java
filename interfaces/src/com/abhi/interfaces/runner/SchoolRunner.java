package com.abhi.interfaces.runner;

import com.abhi.interfaces.internal.*;
import com.abhi.interfaces.rules.*;

public class SchoolRunner {
    public static void main(String[] args) {
        School school = new GreenwoodSchool();
        school.attendClasses();
        school.submitAssignments();
        school.participateInSports();
        school.attendParentTeacherMeet();
        school.joinClubs();
        school.takeExams();
        school.getReportCard();
        GreenwoodSchool greenwoodSchool = new GreenwoodSchool();
        greenwoodSchool.attendClasses();
        greenwoodSchool.submitAssignments();
        greenwoodSchool.participateInSports();
        greenwoodSchool.attendParentTeacherMeet();
        greenwoodSchool.joinClubs();
        greenwoodSchool.takeExams();
        greenwoodSchool.getReportCard();
        System.out.println("======================================");

        College college = new TechUniversity();
        college.attendLectures();
        college.submitProjects();
        college.participateInSeminars();
        college.joinInternships();
        college.attendWorkshops();
        college.appearForExams();
        college.receiveDegree();
        TechUniversity techUniversity = new TechUniversity();
        techUniversity.attendLectures();
        techUniversity.submitProjects();
        techUniversity.participateInSeminars();
        techUniversity.joinInternships();
        techUniversity.attendWorkshops();
        techUniversity.appearForExams();
        techUniversity.receiveDegree();
        System.out.println("======================================");

        OnlineCourse course = new CourseraCourse();
        course.watchLectures();
        course.participateInDiscussions();
        course.completeAssignments();
        course.takeQuizzes();
        course.submitProjects();
        course.earnCertificate();
        course.attendWebinars();
        CourseraCourse courseraCourse = new CourseraCourse();
        courseraCourse.watchLectures();
        courseraCourse.participateInDiscussions();
        courseraCourse.completeAssignments();
        courseraCourse.takeQuizzes();
        courseraCourse.submitProjects();
        courseraCourse.earnCertificate();
        courseraCourse.attendWebinars();
        System.out.println("======================================");

        ExamPortal portal = new VTUExamPortal();
        portal.registerForExam();
        portal.viewTimetable();
        portal.downloadAdmitCard();
        portal.viewResults();
        portal.applyForRevaluation();
        portal.getExamNotifications();
        portal.requestExamTranscripts();
        VTUExamPortal vtuExamPortal = new VTUExamPortal();
        vtuExamPortal.registerForExam();
        vtuExamPortal.viewTimetable();
        vtuExamPortal.downloadAdmitCard();
        vtuExamPortal.viewResults();
        vtuExamPortal.applyForRevaluation();
        vtuExamPortal.getExamNotifications();
        vtuExamPortal.requestExamTranscripts();
        System.out.println("======================================");

        EbookReader ebookReader = new KindleReader();
        ebookReader.openBook();
        ebookReader.closeBook();
        ebookReader.bookmarkPage();
        ebookReader.increaseFontSize();
        ebookReader.decreaseFontSize();
        ebookReader.highlightText();
        ebookReader.searchForText();
        KindleReader kindleReader = new KindleReader();
        kindleReader.openBook();
        kindleReader.closeBook();
        kindleReader.bookmarkPage();
        kindleReader.increaseFontSize();
        kindleReader.decreaseFontSize();
        kindleReader.highlightText();
        kindleReader.searchForText();
        System.out.println("======================================");

    }
}
