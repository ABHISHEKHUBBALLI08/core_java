package com.abhi.developers.wifi.exception;

public class NoWifiConnection extends RuntimeException{
    public NoWifiConnection(String message)
    {
        super(message);
    }
}
