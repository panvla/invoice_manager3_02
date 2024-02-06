package com.vladimirpandurov.invoice_manager3_02.exception;

public class ApiException extends RuntimeException{
    public ApiException(String message){
        super(message);
    }
}
