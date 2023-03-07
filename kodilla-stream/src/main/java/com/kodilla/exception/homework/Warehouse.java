package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public List<Order> addOrder(Order order) {
        this.orders.add(order);
        return null;
    }

    Order getOrder(String number) {
        Order searchedOrder = orders
                .stream().filter(order -> order.getNumber().equals(number)).findAny().get();
        return  searchedOrder;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "orders=" + orders +
                '}';
    }
}