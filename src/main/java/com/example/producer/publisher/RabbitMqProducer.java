package com.example.producer.publisher;

import com.example.producer.Data.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqProducer {

    private final RabbitTemplate rabbitTemplate;

    public RabbitMqProducer(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }
    public void sendFirstMessage(){
        this.rabbitTemplate.convertAndSend("directExchange", "first","Welcome");
    }
    public void sendSecondMessage(){
        this.rabbitTemplate.convertAndSend("directExchange", "second","Welcome Again");
    }
}
