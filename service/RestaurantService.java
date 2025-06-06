package com.abhi.resturant.service;

import com.abhi.resturant.dto.RestaurantDto;
import com.abhi.resturant.exception.*;

public interface RestaurantService {
    boolean validate(RestaurantDto restaurantDto) throws NameMisMatch, LowRatingException, NotAOpeningTime, NotAClosingTime, BookingDateMisMatch, BookingTimeMisMatch;
}
