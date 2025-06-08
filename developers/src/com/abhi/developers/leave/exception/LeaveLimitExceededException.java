package com.abhi.developers.leave.exception;

public class LeaveLimitExceededException extends Exception{
    public LeaveLimitExceededException(String message) {
        super(message);
    }
}
