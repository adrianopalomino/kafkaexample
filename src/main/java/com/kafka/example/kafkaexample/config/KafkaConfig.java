package com.kafka.example.kafkaexample.config;

import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaConfig {
	
	@Value("${spring.kafka.bootstrap-servers}")
	private String kafkaHostAndPort;

    @Bean
    KafkaAdmin kafkaAdmin() {
        return new KafkaAdmin(Map.of("bootstrap.servers", kafkaHostAndPort));
    }

    
    // Create a kafka topic
    @Bean
    NewTopic myTopic() {
        return new NewTopic("exampleTopic", 1, (short) 1);
    }

}
