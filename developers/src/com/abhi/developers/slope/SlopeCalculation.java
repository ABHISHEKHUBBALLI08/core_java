package com.abhi.developers.slope;

import java.util.Scanner;

public class SlopeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 &y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2 & y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        try {
            if (x1 == x2) {
                throw new ArithmeticException("Cannot divide by zero — vertical line has undefined slope.");
            }
            double slope = (y2 - y1) / (x2 - x1);
            System.out.println("Slope: " + slope);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            scanner.close();
        }


    }
}

