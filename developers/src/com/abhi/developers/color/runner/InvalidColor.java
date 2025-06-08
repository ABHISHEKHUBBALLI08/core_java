package com.abhi.developers.color.runner;

import com.abhi.developers.color.exception.InvalidColorException;
import java.util.Scanner;
public class InvalidColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex color code (e.g., #FF5733): ");
        String input = scanner.nextLine();

        try {
            if (!input.matches("^#[0-9A-Fa-f]{6}$")) {
                throw new InvalidColorException("Invalid color code format! Use #RRGGBB (e.g., #FF0000).");
            }
            System.out.println("Color code is valid.");
        } catch (InvalidColorException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
