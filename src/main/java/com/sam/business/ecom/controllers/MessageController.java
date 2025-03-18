package com.sam.business.ecom.controllers;
import com.sam.business.ecom.dtos.ClientDto;
import com.sam.business.ecom.services.MessageSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageSenderService messageSenderService;

    @PostMapping("/send")
    public String sendMessage(@RequestBody ClientDto clientDto) {
        messageSenderService.sendMessage(clientDto);
        return "Message sent successfully!";
    }
}
