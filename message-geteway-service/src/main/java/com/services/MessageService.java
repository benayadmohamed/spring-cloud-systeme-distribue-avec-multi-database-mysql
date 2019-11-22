package com.services;


import com.channels.MessageStreams;
import com.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


@Service
public class MessageService {
    @Autowired
    private MessageStreams messageStreams;


    public boolean saveToBroker(Message message) {
        MessageChannel messageChannel = messageStreams.saveMessageOut();
        return messageChannel.send(MessageBuilder
                .withPayload(message)
                .build());
    }


}
