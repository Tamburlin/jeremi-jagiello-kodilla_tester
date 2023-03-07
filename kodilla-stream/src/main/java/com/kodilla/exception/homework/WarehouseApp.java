package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Order order1 = new Order("1");
        Order order2 = new Order("2");
        Order order3 = new Order("3");
       // System.out.println(warehouse.getOrders());
        System.out.println(order1.getNumber());
        warehouse.addOrder(order1);
        System.out.println(warehouse.getOrders());
    }
}
