package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("12"));
        warehouse.addOrder(new Order("97"));
        warehouse.addOrder(new Order("114"));
        warehouse.addOrder(new Order("48"));

        try {
            Order order = warehouse.getOrder("283");
            System.out.println("Found order: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }
    }
}
