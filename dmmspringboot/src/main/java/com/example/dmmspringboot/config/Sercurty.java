package com.example.dmmspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
@EnableMethodSecurity(securedEnabled = true)
public class Sercurty {
    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

}