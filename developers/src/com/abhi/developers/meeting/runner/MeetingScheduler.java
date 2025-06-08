package com.abhi.developers.meeting.runner;

import com.abhi.developers.meeting.exception.MeetingOverlapException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MeetingScheduler {
    public static void main(String[] args) {
        LocalDateTime existingStart = LocalDateTime.of(2025, 6, 8, 10, 0);
        LocalDateTime existingEnd = existingStart.plusHours(1);

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter meeting date and time (yyyy-MM-dd HH:mm):");
            String inputDateTime = scanner.nextLine();

            System.out.println("Enter duration in minutes:");
            int duration = scanner.nextInt();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime newStart = LocalDateTime.parse(inputDateTime, formatter);
            LocalDateTime newEnd = newStart.plusMinutes(duration);
            boolean overlaps = !(newEnd.isBefore(existingStart) || newStart.isAfter(existingEnd));

            if (overlaps) {
                throw new MeetingOverlapException("Meeting time overlaps with an existing meeting.");
            }
            System.out.println("Meeting scheduled from " + newStart + " to " + newEnd);
        } catch (MeetingOverlapException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
