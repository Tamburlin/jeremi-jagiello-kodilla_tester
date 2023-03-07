package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Order order1 = new Order("1");
        Order order2 = new Order("2");
        Order order3 = new Order("3");
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);
        try {
            System.out.println(warehouse.getOrder("3"));
        } catch (OrderDoesntExistException e) {
            System.out.println("There is no such order.");
        }
    }
}
