package com.example.demo.bussineslayer.mycar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

    @Bean("tesla")
//    @Primary
    public Car teslaCar(){
        return new Car("Tesla", "2023");
    }

    @Bean("toyota")
    public Car toyotaCar(){
        return new Car("Toyota", "2023");
    }

    @Bean
    public Engine teslaEngine(){
        return new Engine("Tesla", true);
    }

    @Bean
    public Engine toyotaEngine(){
        return new Engine("Toyota", true);
    }
}
