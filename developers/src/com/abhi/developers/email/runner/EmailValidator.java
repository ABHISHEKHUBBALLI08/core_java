package com.abhi.developers.email.runner;

import com.abhi.developers.email.exception.InvalidDomainException;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        try {
            if (!email.contains("@") ) {
                throw new IllegalArgumentException("Invalid email format. '@' symbol missing ");
            }
            String[] parts = email.split("@");
            if (parts.length != 2 || parts[1].isEmpty()) {
                throw new IllegalArgumentException("Email must have a domain after '@'.");
            }

            // Inner try: check domain validity
            try {
                String domain = parts[1];
                if (!(domain.equalsIgnoreCase("gmail.com") ||
                        domain.equalsIgnoreCase("yahoo.com") ||
                        domain.equalsIgnoreCase("outlook.com"))) {
                    throw new InvalidDomainException("Unsupported domain: " + domain);
                }
                System.out.println("Email is valid with supported domain: " + domain);
            } catch (InvalidDomainException e) {
                System.out.println("Domain Error: " + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Format Error: " + e.getMessage());
        }finally {
            scanner.close();
        }


    }
}
