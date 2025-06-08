package com.abhi.developers.shopping;

import java.util.Scanner;

public class ShoppingListFetcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] shoppingList = {"Milk", "Bread", "Eggs", "Butter", "Fruits"};
        System.out.print("Enter the index of the item you want to fetch: ");
        try {
            int index = scanner.nextInt();
            System.out.println("You selected: " + shoppingList[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! ");
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid number.");
        }finally {
            scanner.close();
        }


    }
}
