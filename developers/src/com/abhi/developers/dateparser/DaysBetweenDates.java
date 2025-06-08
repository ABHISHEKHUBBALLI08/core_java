package com.abhi.developers.dateparser;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter first date (yyyy-MM-dd):");
            String date1Str = scanner.nextLine();
            System.out.println("Enter second date (yyyy-MM-dd):");
            String date2Str = scanner.nextLine();
            if (date1Str == null || date2Str == null) {
                throw new NullPointerException("One of the dates is null.");
            }
            LocalDate date1 = LocalDate.parse(date1Str);
            LocalDate date2 = LocalDate.parse(date2Str);
            long daysBetween = ChronoUnit.DAYS.between(date1, date2);
            System.out.println("Days between: " + Math.abs(daysBetween));

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd (e.g., 2023-08-15).");
        } catch (NullPointerException e) {
            System.out.println("Error: One or both date inputs were null.");
        }finally {
            scanner.close();
        }
    }
}

