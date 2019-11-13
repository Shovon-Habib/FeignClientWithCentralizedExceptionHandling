package com.example.demo;

import lombok.Data;

@Data
public class Post {

    Long userId;
    Long id;
    String title;
    String body;
}
