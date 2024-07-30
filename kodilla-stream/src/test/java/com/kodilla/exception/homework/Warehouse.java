package com.kodilla.exception.homework;

import java.util.*;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Optional<Order> order = orders.stream()
                .filter(orders -> orders.getNumber().equals(number))
                .findFirst();

    return order.orElseThrow(() -> new OrderDoesntExistException ("Order with number " + number + " not found"));
    }
}
