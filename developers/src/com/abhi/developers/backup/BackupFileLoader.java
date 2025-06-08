package com.abhi.developers.backup;

import java.io.*;

public class BackupFileLoader {

    public static void main(String[] args) {
        String mainFile = "config.txt";
        String backupFile = "backup_config.txt";
        try {
            System.out.println("Trying to load main config...");
            loadFile(mainFile);
        } catch (IOException e) {
            System.out.println("Main config failed: " + e.getMessage());
            try {
                System.out.println("Trying to load backup config...");
                loadFile(backupFile);
            } catch (IOException ex) {
                System.out.println("Backup config also failed: " + ex.getMessage());
            }
        }
    }
    public static void loadFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;

        System.out.println("Contents of " + fileName + ":");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
