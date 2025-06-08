package com.abhi.developers.dateparser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.Year;
import java.util.Scanner;

public class LeapYearBirthdateValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter birthdate (dd-MM-yyyy):");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate birthDate = LocalDate.parse(input, formatter);
            System.out.println("Valid birthdate: " + birthDate);
             int year = birthDate.getYear();
            if (Year.isLeap(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format or non-existent date (e.g., 29-02-2023 is not valid).");
        }finally {
            scanner.close();
        }
    }
}
