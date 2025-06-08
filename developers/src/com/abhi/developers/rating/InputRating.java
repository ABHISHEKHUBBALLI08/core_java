package com.abhi.developers.rating;

import com.abhi.developers.rating.exception.RatingMisMatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputRating {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the rating:");
        try{
            int rating=scanner.nextInt();
            if(rating<1 || rating>5 ){
                throw new RatingMisMatch("in-valid rating");
            }else{
                System.out.println("valid rating");
            }

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }
}
