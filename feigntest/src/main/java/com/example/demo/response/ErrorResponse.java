package com.example.demo.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Synesis IT on 11/13/2019.
 */
@Data
@Builder
@NoArgsConstructor
public class ErrorResponse {

    boolean isSuccess = false;
    String message;

    public ErrorResponse(boolean isSuccess, String message) {
        this.message = message;
    }
}
