package com.abhi.developers.dateparser;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InvalidDateFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date (dd-MM-yyyy):");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate date = LocalDate.parse(input, formatter);
            System.out.println("Parsed date: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format or non-existent date!");
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }
}
