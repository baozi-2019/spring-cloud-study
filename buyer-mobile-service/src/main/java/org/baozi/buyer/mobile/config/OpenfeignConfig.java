package org.baozi.buyer.mobile.config;

import feign.codec.Decoder;
import feign.codec.Encoder;
import org.baozi.common.util.JacksonConverterUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class OpenfeignConfig {

    @Bean
    public Decoder feignDecoder() {
        ObjectFactory<HttpMessageConverters> objectFactory = () -> new HttpMessageConverters(JacksonConverterUtil.createMappingJackson2HttpMessageConverter());
        return new SpringDecoder(objectFactory, new EmptyObjectProvider<>());
    }

    @Bean
    public Encoder feignEncoder() {
        ObjectFactory<HttpMessageConverters> objectFactory = () -> new HttpMessageConverters(JacksonConverterUtil.createMappingJackson2HttpMessageConverter());
        return new SpringEncoder(objectFactory);
    }

    static class EmptyObjectProvider<T> implements ObjectProvider<T> {
        @Override
        public T getObject(Object... args) throws BeansException {
            return null;
        }

        @Override
        public T getIfAvailable() throws BeansException {
            return null;
        }

        @Override
        public T getIfUnique() throws BeansException {
            return null;
        }

        @Override
        public T getObject() throws BeansException {
            return null;
        }

        @Override
        public void forEach(Consumer action) {
            // do nothing
        }
    }

}
