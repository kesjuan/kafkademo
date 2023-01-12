package com.kafkatrial.DemoforKafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    //Topic is like a table in a database or folder in a file system.
//To create a topic on startup, add a bean of type NewTopic. If the topic already exists,
// the bean is ignored. We will use the topic name "javaguides" in this example.
    @Bean
    public NewTopic javaguidesTopic(){
        return TopicBuilder.name("javaguides")
                .build();
    }
}
