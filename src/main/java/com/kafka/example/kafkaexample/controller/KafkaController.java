package com.kafka.example.kafkaexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.example.kafkaexample.service.KafkaProducer;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/publish/{message}")
    public String post(@PathVariable("message") final String message) {
        kafkaProducer.sendMessage(message);
        return "Publicado com sucesso: " + message;
    }
}
