package com.abhi.developers.leave.runner;


import com.abhi.developers.leave.exception.LeaveLimitExceededException;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LeaveManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Leave Start Date (yyyy-MM-dd): ");
            String startDateInput = scanner.nextLine();

            System.out.print("Enter Leave End Date (yyyy-MM-dd): ");
            String endDateInput = scanner.nextLine();

            LocalDate startDate = LocalDate.parse(startDateInput);
            LocalDate endDate = LocalDate.parse(endDateInput);

            if (startDate.isAfter(endDate)) {
                throw new IllegalArgumentException("Start date cannot be after end date.");
            }

            long days = ChronoUnit.DAYS.between(startDate, endDate) + 1; // Inclusive

            if (days > 10) {
                throw new LeaveLimitExceededException("Leave cannot exceed 10 days. You requested: " + days + " days.");
            }

            System.out.println("Leave approved for " + name + " from " + startDate + " to " + endDate + " (" + days + " days)");

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Use yyyy-MM-dd.");
        } catch (IllegalArgumentException | LeaveLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
