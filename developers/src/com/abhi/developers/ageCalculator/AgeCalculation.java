package com.abhi.developers.ageCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class AgeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthdate (yyyy-MM-dd):");
        String birthDateStr = scanner.nextLine();
        try {
            LocalDate birthDate = LocalDate.parse(birthDateStr); // Expected format: yyyy-MM-dd
            LocalDate today = LocalDate.now();

            if (birthDate.isAfter(today)) {
                System.out.println("Birthdate cannot be in the future.");
                return;
            }
            Period age = Period.between(birthDate, today);
            System.out.println("You are " + age.getYears() + " years old.");
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format or value");
        }finally {
            scanner.close();
        }
    }
}
