package com.cubescale.kafka.consumer.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerListener {

    private Logger logger = LoggerFactory.getLogger(KafkaConsumerListener.class);
    public static final String _TOPIC = "new-topic";

    @KafkaListener(topics = {_TOPIC}, groupId = "kafka-group")
    public void listener(String message) {
        logger.info("Message received: " + message);
    }
}
