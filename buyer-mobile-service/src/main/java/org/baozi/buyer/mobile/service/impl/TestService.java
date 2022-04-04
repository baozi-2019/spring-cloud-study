package org.baozi.buyer.mobile.service.impl;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.baozi.buyer.mobile.service.ITestService;
import org.baozi.payment.api.test.ITestClient;
import org.baozi.payment.api.test.VO.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TestService implements ITestService {
    private final ITestClient testClient;

    @Autowired
    public TestService(
            ITestClient testClient
    ) {
        this.testClient = testClient;
    }

    @CircuitBreaker(name = "testA", fallbackMethod = "fallback")
    @Override
    public TestVO test(String p2) {
        return testClient.test(LocalDateTime.now(), p2).getResponseData();
    }

    private TestVO fallback(Exception e) {
        System.out.println(e.getMessage());
        System.out.println("超时");
        throw new RuntimeException("sss");
    }
}
