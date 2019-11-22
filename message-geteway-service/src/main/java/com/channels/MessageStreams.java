package com.channels;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageStreams {
    String OUTPUT = "save-messages-out";

    @Output(OUTPUT)
    MessageChannel saveMessageOut();
}
