package com.example.springbootdemo.controller;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController implements DisposableBean {
    @Value("${spring.application.name}")
    private String shopName;

    @GetMapping
    public String generateGreeting() {
        return "Hello! You have reached our lovely " + shopName + "!";
    }

    @GetMapping("/slow")
    public String generateSlowGreeting() throws InterruptedException {
        Thread.sleep(5000);
        return "Oops! This was a very slow greeting from us.";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("GreetingController says bye-bye!");
    }
}
