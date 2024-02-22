package com.example.app1.book.topic.producer;

import com.example.app1.book.document.BookDocument;
import com.google.gson.Gson;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class KafkaProducer {

    @Value("${kafka.config.topic.id}")
    private String topicId;
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(final @RequestBody BookDocument bookModel) {
        final String key = UUID.randomUUID().toString();

        Gson gson = new Gson();
        String json = gson.toJson(bookModel);
        kafkaTemplate.send(topicId, key, json);
    }

}
