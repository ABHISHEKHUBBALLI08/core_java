package com.abhi.developers.route.exception;

public class RouteNotFound extends RuntimeException{
    public RouteNotFound(String message){
        super(message);
    }
}
