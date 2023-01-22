package com.rutkovski.spring.rest.exeption_handing;

public class NoSuchEmployeeException extends RuntimeException {


    public NoSuchEmployeeException(String message) {
        super(message);
    }

}
