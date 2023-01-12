package com.kafkatrial.DemoforKafka;

import com.kafkatrial.DemoforKafka.recy.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
//Apache Kafka is an open-source distributed streaming system used for stream processing,
// real-time data pipelines, and data integration at scale.
// Kafka broker is the Kafka server.
// it acts as a message broker between the producer and consumer.
//Consumer is an application that reads messages from the Kafka server.
@Service
public class Consumer {
   //Kafka Consumer is the service that will be responsible for reading messages
    // and processing them according to the needs of your own business logic.



   private final Logger logger = LoggerFactory.getLogger(Consumer.class);
//
    @KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID)
    public void consume(String message) throws IOException {
        logger.info(String.format("; Consumed message -> %s", message));
        //Here, we told our method to consume (String message) to subscribe to the user’s topic
        // and just emit every message to the application log
    }
}
