package com.example.demo_second.model;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    @KafkaListener(topics = "test-topic", groupId = "spring-consumer")
    public void consumeOrder(String message) {
        System.out.println("message received from order service" + message);
    }
}
