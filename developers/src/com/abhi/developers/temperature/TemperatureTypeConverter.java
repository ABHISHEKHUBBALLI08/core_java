package com.abhi.developers.temperature;

import java.util.Scanner;

public class TemperatureTypeConverter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the temperature value");
        String temperature=scanner.next();
        try {
            Double temperature1=Double.parseDouble(temperature);
            System.out.println(temperature1);
        }catch (NumberFormatException e){
            System.out.println(" please enter crt input");
        }finally {
            scanner.close();
        }

    }
}
