package com.abhi.developers.event;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EventScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");

        try {
            System.out.print("Enter first event start time (HH:mm): ");
            LocalTime start1 = LocalTime.parse(scanner.nextLine(), fmt);
            System.out.print("Enter first event end time   (HH:mm): ");
            LocalTime end1   = LocalTime.parse(scanner.nextLine(), fmt);
            System.out.print("Enter second event start time (HH:mm): ");
            LocalTime start2 = LocalTime.parse(scanner.nextLine(), fmt);
            System.out.print("Enter second event end time   (HH:mm): ");
            LocalTime end2   = LocalTime.parse(scanner.nextLine(), fmt);

            if (end1.isBefore(start1) || end2.isBefore(start2)) {
                throw new IllegalArgumentException("An event's end time is before its start time.");
            }
            if (end1.isAfter(start2)) {
                throw new IllegalArgumentException(
                        "Scheduling conflict: first event ends at " + end1 +
                                ", which is after second event starts at " + start2
                );
            }
            System.out.println("Events scheduled successfully:");
            System.out.println("  1) " + start1 + " → " + end1);
            System.out.println("  2) " + start2 + " → " + end2);
        }
        catch (Exception e) {
            System.err.println("Error: please use HH:mm format, e.g. 09:30 or 14:45.");
        }finally {
            scanner.close();
        }
    }
}
