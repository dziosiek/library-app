package com.example.app2.book.kafka;

import com.example.app2.book.jpa.entity.BookEntity;
import com.example.app2.book.jpa.repository.BookRepository;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {

    private BookRepository bookRepository;

    @Autowired
    public KafkaConsumer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @KafkaListener(topics = "${kafka.config.topic.id}", groupId = "${kafka.config.group.id}")
    public void consumer(final ConsumerRecord<String, String> consumerRecord) {
        Gson gson = new Gson();
        BookEntity bookModel = gson.fromJson(consumerRecord.value(), BookEntity.class);
        BookEntity saved = bookRepository.save(bookModel);
    }
}