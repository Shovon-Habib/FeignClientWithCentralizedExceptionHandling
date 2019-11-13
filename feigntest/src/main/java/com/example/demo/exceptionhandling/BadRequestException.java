package com.example.demo.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {
    String message;
    public BadRequestException(String message) {
        super(message);
        this.message = message;
    }
}
