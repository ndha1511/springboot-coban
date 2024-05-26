package com.code.springbootcoban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCoBanApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCoBanApplication.class, args);
    }

    @Bean
    public String helloBean() {
        return "hello";
    }

}