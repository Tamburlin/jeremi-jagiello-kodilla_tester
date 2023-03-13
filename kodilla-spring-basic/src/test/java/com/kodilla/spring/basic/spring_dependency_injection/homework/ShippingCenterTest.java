package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTest {

    @Test
    public void shouldReturnTrue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Assertions.assertTrue(bean.deliverPackage("Dupa", 29));
    }

    @Test
    public void shouldReturnFalse() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Assertions.assertFalse(bean.deliverPackage("Dupa", 31));
    }

    @Test
    public void shouldReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        NotificationService bean = context.getBean(NotificationService.class);
        Assertions.assertEquals("Package delivered to: Dupa", bean.success("Dupa"));
    }

    @Test
    public void shouldReturnAnotherButDifferentCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        NotificationService bean = context.getBean(NotificationService.class);
        Assertions.assertEquals("Package not delivered to: Dupa", bean.fail("Dupa"));
    }
}