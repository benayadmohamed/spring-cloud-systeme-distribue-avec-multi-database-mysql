package com.controllers;

import com.models.Message;
import com.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;


    @GetMapping("")
    Flux<Message> findByFromProfileId(@PathVariable("id") long id) {
        return Flux.fromStream(messageService.findAll().stream());
    }


}
