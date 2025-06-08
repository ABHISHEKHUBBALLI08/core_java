package com.abhi.developers.resizer;

import java.util.Scanner;

public class ImageResizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter image width & height: ");
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            if (width < 0 || height < 0) {
                throw new IllegalArgumentException("Width and height must be non-negative.");
            }
            System.out.println("Resizing image to ... " );
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }finally {
            scanner.close();
        }


    }
}
