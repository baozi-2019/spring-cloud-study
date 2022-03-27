package org.baozi.buyer.mobile.config;

import org.baozi.common.util.JacksonConverterUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConverterConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.clear();
        converters.add(JacksonConverterUtil.createMappingJackson2HttpMessageConverter());
    }
}
