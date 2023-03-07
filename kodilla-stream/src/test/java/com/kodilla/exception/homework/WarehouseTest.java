package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    @Test
    public void shouldThrowException() {
        Warehouse warehouse1 = new Warehouse();
        Order order = new Order("1");
        assertThrows(OrderDoesntExistException.class, () -> warehouse1.getOrder("2"));
    }

    @Test
    public void shouldNotThrowException() {
        Warehouse warehouse1 = new Warehouse();
        Order order = new Order("1");
        warehouse1.addOrder(order);
        assertDoesNotThrow(() -> warehouse1.getOrder("1"));
    }

}