package com.example.WebSocket.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WebSocketIntegrationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testAllBeansAreCreated() {
        assertNotNull(applicationContext.getBean("webSocketConfig"));
        assertNotNull(applicationContext.getBean("webSocketController"));
        assertNotNull(applicationContext.getBean("webSocketMessageService"));
    }

    @Test
    void testWebSocketConfiguration() {
        assertTrue(applicationContext.containsBean("webSocketConfig"));
    }
}