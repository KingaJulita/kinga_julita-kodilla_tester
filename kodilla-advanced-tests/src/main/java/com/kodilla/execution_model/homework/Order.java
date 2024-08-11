package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double orderValue;
    private String login;
    private LocalDate orderDate;

    public Order(String login, LocalDate orderDate, double orderValue) {
        this.login = login;
        this.orderDate = orderDate;
        this.orderValue = orderValue;
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getOrderValue() {
        return orderValue;
    }

    @Override
    public String toString() {
        return "Order{" +
                "login='" + login + '\'' +
                ", orderValue=" + orderValue +
                ", orderDate=" + orderDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(orderValue, order.orderValue) == 0 && Objects.equals(login, order.login) && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderValue, login, orderDate);
    }
}
