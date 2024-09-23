package com.cubescale.kafka.producer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringBootProducerApplication {

	public static final String _TOPIC = "new-topic";

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProducerApplication.class, args);
	}

	@Bean
	CommandLineRunner init(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			kafkaTemplate.send(_TOPIC, "Hello world! First ScaleIQ Kafka deployment using Spring Boot");
		};
	}

}
