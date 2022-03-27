package org.baozi.buyer.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableFeignClients(basePackages = "org.baozi.payment.api")
@EnableEurekaClient
@EnableOpenApi
public class BuyerMobileServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BuyerMobileServiceApplication.class, args);
    }
}
