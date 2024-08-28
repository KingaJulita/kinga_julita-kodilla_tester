package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ClockConfiguration {

    @Bean
    @Scope("prototype")
    public Clock clock() {
        return new Clock();
    }
}
