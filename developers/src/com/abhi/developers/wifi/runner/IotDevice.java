package com.abhi.developers.wifi.runner;

import com.abhi.developers.wifi.exception.NoWifiConnection;

import java.util.Scanner;

public class IotDevice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the IoT device connected to Wi-Fi? (yes/no): ");
        String response = scanner.nextLine();
        try {
            if (!response.equals("yes")) {
                throw new NoWifiConnection("No Wi-Fi connection! Please check your network settings.");
            }
            System.out.println("Device is connected to Wi-Fi. Monitoring started...");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            scanner.close();
        }


    }







        }
