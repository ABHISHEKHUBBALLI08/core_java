package com.abhi.developers.temperature;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TemperatureLogger {
    public static void main(String[] args) {
        File file = new File("temperature_log.txt"); // Make sure this file exists

        try (Scanner scanner = new Scanner(file)) {
            System.out.println("Temperature Logs:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getName());
            e.printStackTrace();
        }
    }
}
