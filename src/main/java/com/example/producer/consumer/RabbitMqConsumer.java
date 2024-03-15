package com.example.producer.consumer;
import com.example.producer.Data.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqConsumer {

    @RabbitListener(queues = "First_Queue")
    public void consumeFirstQueueMessage(String message){
        System.out.println("First Queue Message *****************" + message);
    }

    @RabbitListener(queues = "Second_Queue")
    public void consumeSecondQueueMessage(String message){
        System.out.println("Second Queue Message *****************" + message);
    }

}
