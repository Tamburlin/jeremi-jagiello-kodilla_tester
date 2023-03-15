package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ClockTest {

    @Test
    public void shouldCreateDifferentTimes() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstBean.getTime().getNano(), secondBean.getTime().getNano());
       // Assertions.assertNotEquals(secondBean.getTime().getNano(),thirdBean.getTime().getNano()); - this one is equal for some reason
        Assertions.assertNotEquals(firstBean.getTime().getNano(),thirdBean.getTime().getNano());
    }

}