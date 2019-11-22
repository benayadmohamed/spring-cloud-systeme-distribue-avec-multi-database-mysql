package com.services;


import com.channels.MessageStreams;
import com.models.Message;
import com.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;


    public Collection<Message> findAll() {
        return messageRepository.findAll();
    }

    public Message save(Message message) {
        return messageRepository.save(message);
    }


}
