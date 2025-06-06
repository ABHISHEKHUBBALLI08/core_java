package com.abhi.resturant.service;

import com.abhi.resturant.dto.RestaurantDto;
import com.abhi.resturant.exception.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantServiceImpl implements RestaurantService{
    @Override
    public boolean validate(RestaurantDto restaurantDto) throws NameMisMatch, LowRatingException, NotAOpeningTime, NotAClosingTime, BookingDateMisMatch, BookingTimeMisMatch {
        if(restaurantDto.getRestaurantName()==null){
            throw new NameMisMatch("restaurant name is  null");
        } else if (restaurantDto.getRestaurantName().length()<3  || restaurantDto.getRestaurantName().length()>25) {
            throw  new NameMisMatch("in-valid restaurant name");
        } else if (Character.isDigit(restaurantDto.getRestaurantName().charAt(0))) {
            throw  new NameMisMatch("restaurant name cannot start with a number");
        }else {
            System.out.println("crt restaurant name");
        }
        if (restaurantDto.getRestaurantRating()<3){
            throw new LowRatingException("Restaurant has less rating");
        }
        else {
            System.out.println("restaurant has good rating");
        }
        if (restaurantDto.getRestaurantFoodMenu()==null){
            throw  new NullPointerException();
        }
        if (restaurantDto.getRestaurantOpeningTime().isAfter(LocalTime.of(9,0))){
            throw  new NotAOpeningTime("restaurant opens after 9am");
        }else {
            System.out.println("restaurant is open ");
        }
        if (restaurantDto.getRestaurantClosingTime().isBefore(LocalTime.of(12,0))){
            throw new NotAClosingTime("restaurant is closed");
        }else{
            System.out.println("restaurant is open");
        }
        if (restaurantDto.getRestaurantBookedDate().isBefore(LocalDate.now())){
            throw new BookingDateMisMatch("can not book previous day");
        }else {
            System.out.println("thanks for booking");
        }

        if (restaurantDto.getRestaurantBookedTime().isBefore(LocalTime.of(9,0)) ||
                restaurantDto.getRestaurantBookedTime().isAfter(LocalTime.of(12,0))){
            throw new BookingTimeMisMatch("cannot book restaurant");
        }else {
            System.out.println("thanks for booking");
        }
        return true;
    }
}
