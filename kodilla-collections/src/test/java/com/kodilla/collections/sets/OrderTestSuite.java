package com.kodilla.collections.sets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTestSuite {

    @Test
    public void testOrderEquality() {
        // Given
        Order order1 = new Order("1/2019", "Iron", 1.0);
        Order order2 = new Order("1/2019", "Iron", 1.0);

        // When & Then
        assertEquals(order1, order2);
    }

    @Test
    public void testOrderFields() {
        // Given
        Order order = new Order("2/2019", "Cutlery", 6.0);

        // When & Then
        assertEquals("2/2019", order.getOrderNumber());
        assertEquals("Cutlery", order.getProductName());
        assertEquals(6.0, order.getQuantity());
    }
}
