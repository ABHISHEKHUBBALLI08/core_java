package com.abhi.lotery.servlet;

import java.util.Random;
import java.util.Scanner;

public class LotteryServlet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int systemNumber=0;
        int randomNumber= random.nextInt(100);
        System.out.println("enter the number:");
        try{
            while(randomNumber!=systemNumber) {
                systemNumber = scanner.nextInt();

                if (systemNumber == randomNumber) {
                    System.out.println("system number is " + systemNumber + ", random number is" + randomNumber);
                    System.out.println("you have won lottery");
                } else {
                    System.out.println(systemNumber + "," + randomNumber);
                    System.out.println("no lottery,retry");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }
}
