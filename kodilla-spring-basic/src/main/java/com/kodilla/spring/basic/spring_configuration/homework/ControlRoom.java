package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ControlRoom {

    @Bean
    public Car choseCarType() {
        Random random = new Random();
        int month = random.nextInt(12 - 1) + 1;
        if (month > 2 && month < 6) {
            return new Sedan();
        }
        if (month > 8 && month < 12) {
            return new Sedan();
        }
        if (month == 12 || (month > 0 && month < 3)) {
            return new SUV();
        } else {
            return new Cabrio();
        }
    }

    @Bean
    public String lightStatus() {
        Random random = new Random();
        int time = random.nextInt(240000 - 1) + 1;
        if (time >= 200000 || time <= 600000) {
            return "ON";
        } else return "OFF";
    }

    public String control() {
        return ("Car: " + choseCarType().getCarType() + ", Lights: " + lightStatus());
    }
}
