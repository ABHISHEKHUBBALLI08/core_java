package com.abhi.developers.email.exception;

public class InvalidDomainException extends RuntimeException{
    public InvalidDomainException(String message){
        super(message);
    }
}
