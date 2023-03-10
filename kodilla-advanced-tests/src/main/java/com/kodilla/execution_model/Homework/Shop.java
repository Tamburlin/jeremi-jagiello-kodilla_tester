package com.kodilla.execution_model.Homework;

import java.time.LocalDate;
import java.util.HashSet;

public class Shop {
    HashSet<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public HashSet<Order> returnOrdersFromLastTwoYears() {
        HashSet<Order> LastYears = new HashSet<>();
        LocalDate now = LocalDate.now();
        LocalDate twoYearsAgo = now.minusYears(2);
        for (Order order : this.orders) {
            if (order.getOrderDate().isBefore(now) && order.getOrderDate().isAfter(twoYearsAgo)) {
                LastYears.add(order);
            }
        }
        return LastYears;
    }

    public HashSet<Order> returnOrdersWithPriceInRange(double min, double max) {
        HashSet<Order> inRange = new HashSet<>();
        for (Order order : this.orders) {
            if (order.getOrderPrice() >= min && order.getOrderPrice() <= max) {
                inRange.add(order);
            }
        }
        return inRange;
    }

    public int getNumberOfOrders() {
        int size = 0;
        for (Order order : this.orders) {
            size++;
        }
        return size;
    }

    public double sumOfPricesOfAllOrders() {
        double sum = 0;
        for (Order order : this.orders) {
            sum += order.getOrderPrice();
        }
        return sum;
    }
}