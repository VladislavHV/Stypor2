package com.example.WebSocket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class WebSocketMessageService {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    private final AtomicInteger messageCounter = new AtomicInteger(1);

    @Scheduled(fixedRate = 5000) // Каждые 5 секунд
    public void sendScheduledMessage() {
        String message = String.format(
                "Drone status update #%d - Time: %s - All systems operational",
                messageCounter.getAndIncrement(),
                LocalDateTime.now()
        );

        messagingTemplate.convertAndSend("/topic/drone-messages", message);

        System.out.println("Sent WebSocket message: " + message);
    }
}

