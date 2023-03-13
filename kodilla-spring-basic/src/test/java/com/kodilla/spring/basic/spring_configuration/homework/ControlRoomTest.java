package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ControlRoomTest {

    @Test
    public void shouldCreateRandomCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("choseCarType");
        String type = car.getCarType();
        System.out.println(type);
        Assertions.assertTrue(type =="Sedan" || type == "SUV" || type == "Cabrio");
    }

    @Test
    public void shouldReturnLightsStatus() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        String lights = (String) context.getBean("lightStatus");
        Assertions.assertTrue(lights == "ON" || lights == "OFF");
    }

}