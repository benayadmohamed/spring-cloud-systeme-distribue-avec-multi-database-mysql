package com.configurations;

import com.channels.MessageStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(MessageStreams.class)
public class StreamsConfig {
}
