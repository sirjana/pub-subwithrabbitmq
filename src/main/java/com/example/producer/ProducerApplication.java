package com.example.producer;

import com.example.producer.publisher.RabbitMqProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }


}
