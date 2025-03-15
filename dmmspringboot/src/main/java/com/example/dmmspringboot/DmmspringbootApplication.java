package com.example.dmmspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@SpringBootApplication (exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class DmmspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmmspringbootApplication.class, args);
	}

}
