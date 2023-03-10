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

    public static void main(String[] args) {
        Shop shop = new Shop();
        Order order1 = new Order(2137, LocalDate.of(2010, 04, 05), "Michail");
        shop.addOrder(order1);
        Order order2 = new Order(100, LocalDate.of(2022, 03, 04), "Filip Kosior");
        // System.out.println(shop);
        shop.addOrder(order2);
        System.out.println(shop.returnOrdersFromLastTwoYears());
    }

    @Override
    public String toString() {
        return "Shop{" +
                "orders=" + orders +
                '}';
    }
}