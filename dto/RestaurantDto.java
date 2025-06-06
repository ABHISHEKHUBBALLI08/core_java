package com.abhi.resturant.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class RestaurantDto {
    private String restaurantName;
    private String restaurantLocation;
    private Long restaurantContactDetails;
    private String restaurantEmail;
    private int restaurantRating;
    private String[] restaurantFoodMenu;
    private String restaurantType;
    private LocalTime restaurantOpeningTime;
    private LocalTime restaurantClosingTime;
    private LocalDate restaurantBookedDate;
    private LocalTime restaurantBookedTime;


}
