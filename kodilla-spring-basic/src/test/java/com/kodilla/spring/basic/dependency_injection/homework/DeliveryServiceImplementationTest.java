package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeliveryServiceImplementationTest {

    @Test
    void testDeliverPackageTooHeavy() {
        DeliveryService deliveryService = new DeliveryServiceImplementation();
        boolean result = deliveryService.deliverPackage("Hill Street 11, New York", 31.0);
        assertFalse(result);
    }

    @Test
    void testDeliverPackageSuccess() {
        DeliveryService deliveryService = new DeliveryServiceImplementation();
        boolean result = deliveryService.deliverPackage("Hill Street 11, New York", 18.0);
        assertTrue(result);
    }
}
