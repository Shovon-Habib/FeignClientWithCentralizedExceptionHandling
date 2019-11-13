package com.example.demo.controllers;

import com.example.demo.dto.RequestDTO;
import com.example.demo.feign.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("/api")
@Validated
public class DefaultController {

    @Autowired
    private Client client;

    @GetMapping("/")
    private ResponseEntity<?> getPosts() {
        return ResponseEntity.ok(client.getPost());
    }

    @GetMapping("/by")
    private ResponseEntity<?> getPost(@RequestParam(name = "id") @NotNull String id) {
        return ResponseEntity.ok(client.getPostById(Long.valueOf(id)));
    }

    @GetMapping("/hello")
    public ResponseEntity<?> sayHello(
            @RequestParam @Size(min= 1, max = 5, message = "firstname length must be between 1 and 5") String firstname,
            @RequestParam String middlename,
            @RequestParam(required = false) String lastname){
    /* check lastname value */
        lastname = lastname != null ? lastname : "{lastname-is-optional}";
        return ResponseEntity.ok("Hello " + firstname + " " + middlename + " " + lastname);
    }

    @PostMapping("/")
    public ResponseEntity<?> post(@Valid @RequestBody RequestDTO requestDTO) {
        return ResponseEntity.ok(requestDTO);
    }
}
