package com.abhi.developers.drone.exception;

public class LowBatteryException extends RuntimeException{
    public LowBatteryException(String message){
        super(message);
    }
}
