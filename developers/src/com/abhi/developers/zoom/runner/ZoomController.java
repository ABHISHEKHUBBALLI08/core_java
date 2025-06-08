package com.abhi.developers.zoom.runner;

import com.abhi.developers.zoom.exception.InvalidZoomLevelException;

import java.util.Scanner;

public class ZoomController {

        public static void main(String[] args) {
            final int MAX_ZOOM_LEVEL = 20;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter desired zoom level (max " + MAX_ZOOM_LEVEL + "): ");

            try {
                int zoomLevel = scanner.nextInt();

                if (zoomLevel > MAX_ZOOM_LEVEL) {
                    throw new InvalidZoomLevelException("Zoom level " + zoomLevel + " exceeds the max allowed level of " + MAX_ZOOM_LEVEL + ".");
                }
                System.out.println("Zoom level set to: " + zoomLevel);
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid numeric zoom level.");
            }finally {
                scanner.close();
            }


        }

}
