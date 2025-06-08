package com.abhi.developers.coordinate;

import java.util.Scanner;

public class CoordinateConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0, y = 0;
        try {
            System.out.print("Enter X coordinate: ");
            String xInput = scanner.nextLine();
            try {
                x = Double.parseDouble(xInput);
                if (x < -180 || x > 180) {
                    throw new IllegalArgumentException("X must be between -180 and 180.");
                }
            } catch (Exception e) {
                System.out.println("Invalid X coordinate: " + e.getMessage());
                return;
            }
            System.out.print("Enter Y coordinate: ");
            String yInput = scanner.nextLine();
            try {
                y = Double.parseDouble(yInput);
                if (y < -90 || y > 90) {
                    throw new IllegalArgumentException("Y must be between -90 and 90.");
                }
            } catch (Exception e) {
                System.out.println("Invalid Y coordinate: " + e.getMessage());
                return;
            }
            System.out.println("Valid coordinates received: (" + x + ", " + y + ")");
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }finally {
            scanner.close();
        }

    }
}

