package com.example.demo;

import com.example.demo.config.CustomDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class FeignTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignTestApplication.class, args);
	}

	@Bean
	public ErrorDecoder errorDecoder(){
	    return new CustomDecoder();
    }
}
