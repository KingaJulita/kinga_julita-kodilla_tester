package com.kodilla.spring.basic.dependency_injection;


import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class SimpleApplicationTest {

    @Test
    void testProcessMessage() {
        MessageService messageService = mock(MessageService.class);
        SimpleApplication app = new SimpleApplication(messageService);

        app.processMessage("Hello", "receiver@mail.com");

        verify(messageService, times(1)).send("Hello", "receiver@mail.com");
    }

    @Test
    void testProcessMessageWithEmptyReceiver() {
        MessageService messageService = mock(MessageService.class);
        SimpleApplication app = new SimpleApplication(messageService);

        app.processMessage("Hello", "");

        verify(messageService, never()).send(anyString(), anyString());
    }

    @Test
    void testProcessMessageWithNullReceiver() {
        MessageService messageService = mock(MessageService.class);
        SimpleApplication app = new SimpleApplication(messageService);

        app.processMessage("Hello", null);

        verify(messageService, never()).send(anyString(), anyString());
    }
}
