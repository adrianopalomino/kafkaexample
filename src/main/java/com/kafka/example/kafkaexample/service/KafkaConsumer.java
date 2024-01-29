package com.kafka.example.kafkaexample.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final String TOPIC = "exampleTopic";

    @KafkaListener(topics = TOPIC, groupId = "my-group")
    public void consume(String message) {
        System.out.println("Consumido mensagem: " + message);
    }
}