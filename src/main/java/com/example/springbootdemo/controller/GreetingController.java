package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Value("${spring.application.name}")
    private String shopName;

    @GetMapping
    public String generateGreeting() {
        return "Hello! You have reached our lovely " + shopName + "!";
    }
}
