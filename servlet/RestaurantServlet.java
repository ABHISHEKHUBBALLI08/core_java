package com.abhi.resturant.servlet;

import com.abhi.resturant.dto.RestaurantDto;
import com.abhi.resturant.exception.*;
import com.abhi.resturant.service.RestaurantService;
import com.abhi.resturant.service.RestaurantServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantServlet {
    public static void main(String[] args) {
        RestaurantDto restaurantDto=new RestaurantDto();
        RestaurantService restaurantService=new RestaurantServiceImpl();

        try{

            restaurantDto.setRestaurantName("UB city Restaurant");
            restaurantDto.setRestaurantRating(5);
            restaurantDto.setRestaurantFoodMenu(new String[]{"Dal-makhani","paneer-tikka","kaju-kholapuri","dum-briyani"});
            String item = restaurantDto.getRestaurantFoodMenu()[2];
            System.out.println(item);
            restaurantDto.setRestaurantOpeningTime(LocalTime.of(8,0));
            restaurantDto.setRestaurantClosingTime(LocalTime.of(15,0));
            restaurantDto.setRestaurantBookedTime(LocalTime.of(11,0));
            restaurantDto.setRestaurantBookedDate(LocalDate.of(2025, 6, 10));
            restaurantService.validate(restaurantDto);
        } catch (Exception e) {
            e.printStackTrace();
        }

        

    }
}
