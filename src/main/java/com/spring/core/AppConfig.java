package com.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Vehicle car(){
        return new Car();

    }
    @Bean
    public Vehicle bike(){
        return new Bike();
    }

    @Bean
    public Passenger passenger(){
        return new Passenger(car());
    }
}
