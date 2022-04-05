package org.baozi.buyer.mobile.config;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.io.IOException;
import java.util.function.Consumer;

@Configuration
//@EnableBinding(Sink.class)
public class MQConfig {
    @Bean
    public Consumer<Message<String>> testOutput() {
        return message -> {
            System.out.println(message.getPayload());
            Channel channel = message.getHeaders().get(AmqpHeaders.CHANNEL, Channel.class);
            Long tag = message.getHeaders().get(AmqpHeaders.DELIVERY_TAG, Long.class);
            try {
                if (channel != null && tag != null)
                    channel.basicAck(tag, false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
    }

//    @StreamListener(target = Sink.INPUT)
//    public void test(String test) {
//        System.out.println(test);
//    }
}
