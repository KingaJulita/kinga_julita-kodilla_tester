package com.kodilla.spring.basic.dependency_injection.homework;


import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class ShippingCenterTest {

    @Test
    void testSendPackageSuccess() {
        DeliveryService deliveryService = mock(DeliveryService.class);
        NotificationService notificationService = mock(NotificationService.class);
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        when(deliveryService.deliverPackage("Hill Street 11, New York", 18.2)).thenReturn(true);

        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);

        verify(notificationService).success("Hill Street 11, New York");
        verify(notificationService, never()).fail(anyString());
    }

    @Test
    void testSendPackageFailure() {
        DeliveryService deliveryService = mock(DeliveryService.class);
        NotificationService notificationService = mock(NotificationService.class);
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        when(deliveryService.deliverPackage("Hill Street 11, New York", 31.0)).thenReturn(false);

        shippingCenter.sendPackage("Hill Street 11, New York", 31.0);

        verify(notificationService).fail("Hill Street 11, New York");
        verify(notificationService, never()).success(anyString());
    }
}
