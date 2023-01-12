package com.kafkatrial.DemoforKafka;

import com.kafkatrial.DemoforKafka.recy.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
   //Producer is an application that sends messages.
    private static final Logger logger = LoggerFactory.getLogger(Producer.class);


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
//KafKaProducer class uses KafkaTemplate to send messages to the configured topic name.
//Spring boot provides an auto-configuration for Spring’s KafkaTemplate so you can autowire it directly in your own beans.
    public void sendMessage(String message) {
        logger.info(String.format(" Producing message -> %s", message));
        kafkaTemplate.send(AppConstants.TOPIC_NAME, message);
    }

}
