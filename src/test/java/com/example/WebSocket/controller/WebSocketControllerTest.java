package com.example.WebSocket.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WebSocketControllerTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        assertNotNull(applicationContext.getBean(WebSocketController.class));
    }

    @Test
    void testHandleConnection() {
        WebSocketController controller = new WebSocketController();
        String result = controller.handleConnection("test message");
        assertEquals("Connected to Drone WebSocket service", result);
    }
}
