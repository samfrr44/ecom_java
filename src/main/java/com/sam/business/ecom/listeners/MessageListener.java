package com.sam.business.ecom.listeners;
import com.sam.business.ecom.configs.RabbitMqConfig;
import com.sam.business.ecom.dtos.ClientDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = RabbitMqConfig.QUEUE_NAME)
    public void receiveMessage(ClientDto clientDto) {
        System.out.println("Received message: " + clientDto);
    }
}


