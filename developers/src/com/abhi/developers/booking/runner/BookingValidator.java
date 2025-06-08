package com.abhi.developers.booking.runner;


import com.abhi.developers.booking.exception.PastDateException;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BookingValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter booking date (yyyy-MM-dd):");
        String inputDate = scanner.nextLine();
        try {
            LocalDate bookingDate = LocalDate.parse(inputDate);
            LocalDate today = LocalDate.now();

            if (bookingDate.isBefore(today)) {
                throw new PastDateException("Booking date cannot be in the past.");
            }

            System.out.println("Booking confirmed for: " + bookingDate);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please enter date as yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }
}
