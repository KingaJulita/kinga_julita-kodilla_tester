package com.kodilla.execution_model.homework;

import com.kodilla.parametrized_tests.homework.Shop;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order("kamilkowalski@wp.pl" ,
            LocalDate.of(2024,8,1), 100);
    Order order2 = new Order("piotrcugowski@gmail.com",
            LocalDate.of(2024, 8, 5), 150);
    Order order3 = new Order("justynasteczkowska@gmail.com" ,
            LocalDate.of(2024, 8, 9), 200);
    Order order4 = new Order("nameless@onet.com",
            LocalDate.of(2024, 8, 15), 300);
    Order order5 = new Order("michał@gmail.com",
            LocalDate.of(2023, 6, 6), 100);


    @Test
    public void shouldAddNewOrder() {
        // when
        shop.addOrder(order1);

        // then
        assertEquals(1, shop.getNumberOfOrders());
    }

    @Test
    public void shouldAddDuplicateOrder() {
        // when
        shop.addOrder(order1);
        shop.addOrder(order2);

        // then
        assertEquals(2, shop.getNumberOfOrders());
    }

    @Test
    public void shouldReturnOrdersBetweenDates() {
        // given
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);

        // when
        List<Order> orders = shop.getOrdersBetweenDates(LocalDate.of(2024, 8, 1),
                LocalDate.of(2024, 8, 10));

        // then
        assertEquals(3, orders.size());
        assertTrue(orders.contains(order1));
        assertTrue(orders.contains(order2));
        assertTrue(orders.contains(order3));
    }

    @Test
    public void shouldReturnOrdersValueRange() {
        // given
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);

        // when
        List<Order> orders = shop.getOrdersByValueRange(150 , 200);

        // then
        assertEquals(2, orders.size());
        assertTrue(orders.contains(order2));
        assertTrue(orders.contains(order3));
    }

    @Test
    public void shouldReturnNumberOfOrders() {
        //given
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);

        // when
        int numberOfOrders = shop.getNumberOfOrders();

        // then
        assertEquals(5, numberOfOrders);
    }

    @Test
    public void shouldReturnOrderTotalValue() {
        // given
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);

        // when
        double totalOrderValue = shop.getTotalOrderValue();

        // then
        assertEquals(850, totalOrderValue);
    }

    @Test
    public void shouldReturnOrderWithPastDate() {
        // given
        shop.addOrder(order5);

        // when
        int numberOfOrders = shop.getNumberOfOrders();

        // then
        assertEquals(1, numberOfOrders);
    }

    @Test
    public void testEmptyShop() {
        // When
        int numberOfOrders = shop.getNumberOfOrders();
        double totalValueOfOrders = shop.getTotalOrderValue();
        List<Order> orders = shop.getOrdersBetweenDates(LocalDate.of(2024, 7, 27), LocalDate.of(2024, 7, 31));

        // Then
        assertEquals(0, numberOfOrders);
        assertEquals(0, totalValueOfOrders, 0.01);
        assertTrue(orders.isEmpty());
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}
