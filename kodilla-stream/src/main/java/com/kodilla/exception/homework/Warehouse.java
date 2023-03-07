package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Order handy = orders.stream().filter(order -> order.getNumber().equals(number)).findAny().get(); //musiałem urzyć lokalnej zmiennej do przyrównania, contains() nie zadziałała.
        if (handy.getNumber() == number) return handy;
        throw new OrderDoesntExistException();
    }

    public List<Order> getOrders() {
        return orders;
    }
}