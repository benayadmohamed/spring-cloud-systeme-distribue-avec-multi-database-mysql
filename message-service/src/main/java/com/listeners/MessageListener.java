package com.listeners;

import com.channels.MessageStreams;
import com.models.Message;
import com.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
//@Slf4j
public class MessageListener {


    @Autowired
    private MessageService messageService;

    @StreamListener(MessageStreams.INPUT)
    public void handleGreetings(@Payload Message myMessage) {
        myMessage = messageService.save(myMessage);
        System.out.println("myMessage = [" + myMessage + "]");
//        log.info("Received topic greetings-in : {}", myMessage);
    }

}
