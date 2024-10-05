package com.kodilla.spring.basic.dependency_injection;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TextMessageServiceTest {

    @Test
    void testSend() {
        MessageService service = new TextMessageService();
        String result = service.send("Hello", "receiver@mail.com");
        assertEquals("Hello", result);
    }
}
