package com.kodilla.execution_model.Homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Order {
    private double orderPrice;
    private LocalDate orderDate;
    private String ordererLogin;

    public Order(double orderPrice, LocalDate date, String ordererLogin) {
        this.orderPrice = orderPrice;
        this.orderDate = date;
        this.ordererLogin = ordererLogin;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getOrdererLogin() {
        return ordererLogin;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderPrice=" + orderPrice +
                ", orderDate=" + orderDate +
                ", ordererLogin='" + ordererLogin + '\'' +
                '}';
    }
}