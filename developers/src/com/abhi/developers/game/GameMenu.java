package com.abhi.developers.game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Game Menu ===");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("4. Exit");
        System.out.print("Enter your choice : ");
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Starting new game...");
                    break;
                case 2:
                    System.out.println("Loading game...");
                    break;
                case 3:
                    System.out.println("Exiting. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please select between 1 and 4.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number between 1 and 4.");
        }finally {
            scanner.close();
        }


    }
}
