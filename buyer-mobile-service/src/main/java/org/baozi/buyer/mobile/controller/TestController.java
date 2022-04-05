package org.baozi.buyer.mobile.controller;

import org.baozi.buyer.mobile.service.ITestService;
import org.baozi.payment.api.test.VO.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    private final ITestService testService;

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
