package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext apc = SpringApplication.run(SpringBootDemoApplication.class, args);
		for (String s: apc.getBeanDefinitionNames()) {
			System.out.println(s);
		}
	}

}
