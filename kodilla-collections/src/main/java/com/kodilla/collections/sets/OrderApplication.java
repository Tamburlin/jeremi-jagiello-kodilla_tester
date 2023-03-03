package com.kodilla.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class OrderApplication {
    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();
        orders.add( new Order("13/1889", "Ivory", 5));
        orders.add(new Order("20/2020", "Selenium", 40));
        orders.add(new Order("01/1444", "Bananas", 8 ));
        orders.add(new Order("13/1889", "Ivory", 5));
        System.out.println(orders.size());
        for( Order order : orders)
            System.out.println(order);
    }
}
