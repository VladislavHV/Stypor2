package com.example.WebSocket.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    private static final Logger log = LoggerFactory.getLogger(WebSocketController.class);

    @MessageMapping("/connect")
    @SendTo("/topic/drone-messages")
    public String handleConnection(String message) {
        log.info("Received WebSocket connection message: {}", message);
        return "Connected to Drone WebSocket service";
    }
}