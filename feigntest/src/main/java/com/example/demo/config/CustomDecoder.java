package com.example.demo.config;

import com.example.demo.exceptionhandling.BadRequestException;
import com.example.demo.exceptionhandling.ResourceNotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {

        if (response.status() == 400) {
            return new BadRequestException("Bad Request");
        }
        if (response.status() == 404) {
            return new ResourceNotFoundException("Resource Not Found");
        }
        return new Exception(s);
    }
}
