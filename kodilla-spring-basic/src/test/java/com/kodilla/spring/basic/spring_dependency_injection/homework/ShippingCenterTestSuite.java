package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    public void shouldReturnSuccessMessageWhenPackageDelivered() {
        // Given
        String address = "Aleja Grunwaldzka 580, Gdańsk";
        double weight = 15.0;

        // When
        String result = shippingCenter.sendPackage(address, weight);

        // Then
        assertEquals("Package delivered to: Aleja Grunwaldzka 580, Gdańsk", result);
    }

    @Test
    public void shouldReturnFailureMessageWhenPackageNotDelivered() {
        // Given
        String address = "Mokotowska 25, Warszawa";
        double weight = 35.0;

        // When
        String result = shippingCenter.sendPackage(address, weight);

        // Then
        assertEquals("Package not delivered to: Mokotowska 25, Warszawa", result);
    }
}

