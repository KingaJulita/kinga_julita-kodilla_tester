package com.kodilla.spring.basic.dependency_injection.homework;


import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class NotificationServiceImplementationTest {

    @Test
    void testSuccess() {
        NotificationService notificationService = new NotificationServiceImplementation();
        notificationService.success("Hill Street 11, New York");
        // To verify the output, you can use a mocking framework or redirect output
    }

    @Test
    void testFail() {
        NotificationService notificationService = new NotificationServiceImplementation();
        notificationService.fail("Hill Street 11, New York");
        // To verify the output, you can use a mocking framework or redirect output
    }
}
