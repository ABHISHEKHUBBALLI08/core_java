package com.abhi.developers.userProfile.runner;

public class UserProfileParser {
    public static void main(String[] args) {
        String jsonString = "{name:Alice, age:25}";
        try {
            if (!jsonString.contains("name") || !jsonString.contains("age")) {
                throw new Exception("Missing required fields in JSON.");
            }
            int nameStart = jsonString.indexOf("name:") + 5;
            int nameEnd = jsonString.indexOf(",", nameStart);
            String name = jsonString.substring(nameStart, nameEnd).trim();

            System.out.println("Name: " + name);
            try {
                int ageStart = jsonString.indexOf("age:") + 4;
                int ageEnd = jsonString.indexOf("}", ageStart);
                String ageStr = jsonString.substring(ageStart, ageEnd).trim();
                int age = Integer.parseInt(ageStr);

                System.out.println("Age: " + age);
            } catch (Exception e) {
                System.out.println("Error extracting age: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Invalid JSON format: " + e.getMessage());
        }
    }
}
