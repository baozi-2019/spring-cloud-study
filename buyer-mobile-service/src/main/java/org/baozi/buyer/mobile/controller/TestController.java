package org.baozi.buyer.mobile.controller;

import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.baozi.buyer.mobile.service.ITestService;
import org.baozi.common.bean.Response;
import org.baozi.common.enums.ResponseCodeEnum;
import org.baozi.payment.api.test.ITestClient;
import org.baozi.payment.api.test.VO.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/test")
public class TestController {
    private ITestService testService;

    @Autowired
    public TestController(
            ITestService testService
    ) {
        this.testService = testService;
    }

    @GetMapping("/consumer")
    public TestVO consumerTest(@RequestParam("p2") String p2) {
        return testService.test(p2);
    }
}
