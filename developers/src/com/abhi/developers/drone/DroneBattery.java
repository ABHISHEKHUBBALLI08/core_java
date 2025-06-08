package com.abhi.developers.drone;

import com.abhi.developers.drone.exception.LowBatteryException;

import java.util.Scanner;

public class DroneBattery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int battery=scanner.nextInt();
        try {
            if(battery>10){
                throw new LowBatteryException("battery is low");
            }
            System.out.println("battery is full");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }
}
