package com.abhi.developers.filename;

import java.util.Scanner;

public class FilenameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter filename (e.g., document.txt): ");
        String filename = scanner.nextLine();

        try {
            int dotIndex = filename.lastIndexOf('.');
            if (dotIndex == -1 || dotIndex == filename.length() - 1) {
                throw new StringIndexOutOfBoundsException("Invalid or missing file extension.");
            }
            String extension = filename.substring(dotIndex + 1);
            System.out.println("File extension: " + extension);
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }finally {
            scanner.close();
        }

    }
}
