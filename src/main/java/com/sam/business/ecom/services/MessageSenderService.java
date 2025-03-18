package com.sam.business.ecom.services;
import com.sam.business.ecom.configs.RabbitMqConfig;
import com.sam.business.ecom.dtos.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageSenderService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(ClientDto clientDto) {
        rabbitTemplate.convertAndSend(RabbitMqConfig.QUEUE_NAME, clientDto);
        System.out.println("Message sent: " + clientDto);
    }
}
