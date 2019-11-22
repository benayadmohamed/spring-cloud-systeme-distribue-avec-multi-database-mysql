package com.channels;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageStreams {
    String INPUT = "save-messages-in";

    @Input(INPUT)
    SubscribableChannel saveMessageIn();

}
