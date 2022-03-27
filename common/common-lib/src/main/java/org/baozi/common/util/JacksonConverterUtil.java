package org.baozi.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.baozi.common.serializer.LocalDateDeSerializer;
import org.baozi.common.serializer.LocalDateSerializer;
import org.baozi.common.serializer.LocalDateTimeDeSerializer;
import org.baozi.common.serializer.LocalDateTimeSerializer;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class JacksonConverterUtil {
    public static MappingJackson2HttpMessageConverter createMappingJackson2HttpMessageConverter() {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeSerializer());
        simpleModule.addDeserializer(LocalDate.class, new LocalDateDeSerializer());
        simpleModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        simpleModule.addSerializer(LocalDate.class, new LocalDateSerializer());
        objectMapper.registerModule(simpleModule);
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter(objectMapper);
        converter.setDefaultCharset(StandardCharsets.UTF_8);
        return converter;
    }
}
