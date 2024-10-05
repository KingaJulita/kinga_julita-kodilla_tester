package com.kodilla.spring.basic.dependency_injection;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailMessageServiceTest {

    @Test
    void testSend() {
        MessageService service = new EmailMessageService();
        String result = service.send("Hello", "receiver@mail.com");
        assertEquals("Hello", result);
    }
}
