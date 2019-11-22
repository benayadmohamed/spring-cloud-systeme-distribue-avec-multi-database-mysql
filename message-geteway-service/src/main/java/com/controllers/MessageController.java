package com.controllers;

import com.models.Message;
import com.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/newmessage/{m}")
    Mono<Boolean> message(@PathVariable("m") String message) {
        System.out.println("message = [" + message + "]");
//        return Mono.just(true);
        return Mono.just(messageService.saveToBroker(new Message(message)));
    }

}
