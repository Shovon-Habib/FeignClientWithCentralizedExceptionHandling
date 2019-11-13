package com.example.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
public class RequestDTO {

    @NotNull
    Long id;

    @NotEmpty(message = "name must not be empty")
    String name;
}
