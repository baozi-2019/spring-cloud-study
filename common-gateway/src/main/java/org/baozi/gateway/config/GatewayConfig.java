package org.baozi.gateway.config;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.util.CollectionUtils;

import java.util.List;

//@Configuration
public class GatewayConfig {
//    @Bean
//    @Order(0)
    public GlobalFilter myGlobalFilter() {
        return (exchange, chain) -> {
            List<String> authList = exchange.getRequest().getHeaders().get("X-AUTH");
            if (!CollectionUtils.isEmpty(authList) && authList.stream().anyMatch(e -> e.equals("132456"))) {
                return chain.filter(exchange);
            }
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            return response.setComplete();
        };
    }
}
