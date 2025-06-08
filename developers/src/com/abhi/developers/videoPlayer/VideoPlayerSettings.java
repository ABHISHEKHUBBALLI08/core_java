package com.abhi.developers.videoPlayer;

import java.util.Scanner;

public class VideoPlayerSettings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] supportedDevices = {"Android", "Windows", "Mac"};
        System.out.print("Enter your device name: ");
        String device = scanner.nextLine();
        try {
            boolean supported = false;
            for (String d : supportedDevices) {
                if (d.equalsIgnoreCase(device.trim())) {
                    supported = true;
                    break;
                }
            }
            if (!supported) {
                throw new Exception("Device not compatible with this video player.");
            }
            System.out.println("Device compatible.");
            System.out.print("Enter desired resolution (e.g., 1080p, 720p): ");
            String resolution = scanner.nextLine();
            try {
                if (!(resolution.equals("1080p") || resolution.equals("720p") || resolution.equals("480p"))) {
                    throw new IllegalArgumentException("Resolution not supported: " + resolution);
                }

                System.out.println("Resolution " + resolution + " is supported. Settings applied.");
            } catch (Exception e) {
                System.out.println("Resolution Error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Device Error: " + e.getMessage());
        }finally {

            scanner.close();
        }
    }
}
