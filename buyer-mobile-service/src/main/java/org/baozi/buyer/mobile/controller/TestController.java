package org.baozi.buyer.mobile.controller;

import org.baozi.payment.api.test.ITestClient;
import org.baozi.payment.api.test.VO.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/test")
public class TestController {
    private final ITestClient testClient;

    @Autowired
    public TestController(ITestClient testClient) {
        this.testClient = testClient;
    }

    @GetMapping("/consumer")
    public TestVO consumerTest() {
        return testClient.test(LocalDateTime.now()).getResponseData();
    }
}
