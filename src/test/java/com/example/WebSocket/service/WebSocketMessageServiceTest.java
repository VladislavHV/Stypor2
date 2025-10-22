package com.example.WebSocket.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class WebSocketMessageServiceTest {

    @Mock
    private SimpMessagingTemplate messagingTemplate;

    @InjectMocks
    private WebSocketMessageService webSocketMessageService;

    @Test
    void testSendScheduledMessage() {
        webSocketMessageService.sendScheduledMessage();
        verify(messagingTemplate, times(1))
                .convertAndSend(eq("/topic/drone-messages"), any(String.class));
    }
}