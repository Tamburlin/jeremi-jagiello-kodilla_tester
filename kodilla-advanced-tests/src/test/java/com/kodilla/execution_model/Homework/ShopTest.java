package com.kodilla.execution_model.Homework;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Shop shop = new Shop();
    Order order1 = new Order(2137, LocalDate.of(2010, 04, 05), "Michail");
    Order order2 = new Order(100, LocalDate.of(2022, 03, 04), "Filip Kosior");
    Order order3 = new Order(2000, LocalDate.of(2137, 01, 01), "Nemo");
    Order order4 = new Order(3000, LocalDate.of(1997, 04, 01), "Xawras Wyzryn");

    @Test
    public void shouldAddOrdersToShop() {
        shop.addOrder(order1);
        assertTrue(shop.orders.contains(order1));
    }

    @Test
    public void shopShouldBeEmpty() {
        assertTrue(shop.orders.isEmpty());
    }

    @Test
    public void shouldReturnListOfOrdersFromLast2Years() { //warning - it operates on the actual local realtimeDate of the Pc you are using
        shop.addOrder(order1);
        shop.addOrder(order2);
        assertEquals(shop.returnOrdersFromLastTwoYears().size(), 1);
    }

    @Test
    public void shouldReturnEmptyListOfOrdersFromLast2Years() {
        assertTrue(shop.returnOrdersFromLastTwoYears().isEmpty());
    }

    @Test
    public void shouldReturnOrdersWithPriceInRange() {
        double min = 2000;
        double max = 2500;
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        assertEquals(shop.returnOrdersWithPriceInRange(min, max).size(), 2);
    }

    @Test
    public void shouldReturnEmptySetFromMethodOrdersWithPriceInRange() {
        double min = 2000;
        double max = 2500;
        assertTrue(shop.returnOrdersWithPriceInRange(min, max).isEmpty());
    }

    @Test
    public void shouldReturnNumberOfOrders() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        assertEquals(shop.getNumberOfOrders(), 4);
    }

    @Test
    public void shouldReturnZeroNumberOfOrders() {
        assertEquals(shop.getNumberOfOrders(), 0);
    }

    @Test
    public void shouldReturnSumOfAllOrdersPrice() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        assertEquals(shop.sumOfPricesOfAllOrders(), 7237);
    }

    @Test
    public void shouldReturnZeroSumOfAllOrdersPrice() {
        assertEquals(shop.sumOfPricesOfAllOrders(), 0);
    }
}