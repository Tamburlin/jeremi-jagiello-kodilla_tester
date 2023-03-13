package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {

    @Test
    public void shouldReturnCorrectSum() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Assertions.assertEquals(3.0, bean.add(1.5, 1.5));
    }

    @Test
    public void shouldReturnCorrectsSubtraction() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Assertions.assertEquals(6.5, bean.subtract(10.0, 3.5));
    }

    @Test
    public void shouldReturnCorrectMultiplication() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Assertions.assertEquals(10.89, bean.multiply(3.3, 3.3), 0.01);
    }

    @Test
    public void shouldReturnCorrectDivision() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        Assertions.assertEquals(2.5, bean.divide(5, 2));
    }
    //display was checked manually
}