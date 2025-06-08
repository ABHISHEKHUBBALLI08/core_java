package com.abhi.developers.ingredients;

public class IngredientsList {
    public static void main(String[] args) {
        String[] list={"dosa","idli","sambhar"};
        int i=2;
        try {
            if(i>list.length){
                System.out.println(list[i]);
                throw new ArrayIndexOutOfBoundsException();
            }else {
                System.out.println(list[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
