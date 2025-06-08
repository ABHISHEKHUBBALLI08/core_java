package com.abhi.developers.route.runner;

import com.abhi.developers.route.exception.RouteNotFound;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] availableRoutes = {"Bangalore to Mumbai", "Delhi to Kolkata", "Chennai to Hyderabad"};
        System.out.print("Enter your delivery route: ");
        String userRoute = scanner.nextLine();
        try {
            boolean routeFound = false;
            for (String route : availableRoutes) {
                if (route.equalsIgnoreCase(userRoute.trim())) {
                    routeFound = true;
                    break;
                }
            }
            if (!routeFound) {
                throw new RouteNotFound("Route not found in the system: " + userRoute);
            }
            System.out.println("Route is valid. Tracking your delivery on: " + userRoute);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
