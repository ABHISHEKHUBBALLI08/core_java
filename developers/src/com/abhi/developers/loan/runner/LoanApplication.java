package com.abhi.developers.loan.runner;
import com.abhi.developers.loan.exception.AgeNotEligibleException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class LoanApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Date of Birth (yyyy-MM-dd):");
        String dobInput = scanner.nextLine();
        try {
            LocalDate dob = LocalDate.parse(dobInput);
            LocalDate today = LocalDate.now();

            if (dob.isAfter(today)) {
                throw new AgeNotEligibleException("Date of birth cannot be in the future.");
            }

            int age = Period.between(dob, today).getYears();

            if (age < 21 || age > 60) {
                throw new AgeNotEligibleException("Your age is wrong");
            }

            System.out.println("You are eligible for loan. Your age is: " + age);

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        } catch (AgeNotEligibleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
