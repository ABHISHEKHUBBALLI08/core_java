package com.abhi.developers.dateparser;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class NullDateHandler {
    public static void main(String[] args) {
        LocalDate date = null;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = date.format(formatter);
            System.out.println("Formatted date: " + formattedDate);
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot format a null date.");
        }
    }
}
