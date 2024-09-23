package com.cubescale.kafka.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    public static final String _ONE_DAY_IN_MS = "86400000";
    public static final String _ONE_GIGABYTE_IN_BYTES = "1073741824";
    public static final String _ONE_MB_IN_BYTES = "1000000";
    public static final String _TOPIC = "new-topic";

    @Bean
    public NewTopic generateTopic() {

        Map<String, String> configurations = new HashMap<>();
        configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);
        configurations.put(TopicConfig.RETENTION_MS_CONFIG, _ONE_DAY_IN_MS);
        configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, _ONE_GIGABYTE_IN_BYTES);
        configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, _ONE_MB_IN_BYTES);

        return TopicBuilder.name(_TOPIC)
                .partitions(2)
                .replicas(2)
                .configs(configurations)
                .build();
    }
}
