package com.abhi.developers.booking.exception;

public class PastDateException extends RuntimeException{
    public PastDateException(String message) {
        super(message);
    }
}
