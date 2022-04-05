package org.baozi.buyer.mobile.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
//@EnableBinding(Sink.class)
public class MQConfig {
    @Bean
    public Consumer<String> testOutput() {
        return System.out::println;
    }

//    @StreamListener(target = Sink.INPUT)
//    public void test(String test) {
//        System.out.println(test);
//    }
}
