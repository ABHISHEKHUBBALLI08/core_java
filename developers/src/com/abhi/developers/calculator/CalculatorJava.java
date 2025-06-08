package com.abhi.developers.calculator;

import java.util.Scanner;

public class CalculatorJava {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the two numbers:");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        try{
            int result=a/b;
            System.out.println("result is:"+result);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }
}
