package org.baozi.payment.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.baozi.payment.service.test.ITestService;
import org.baozi.payment.service.test.VO.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"测试*"})
@RestController
public class TestController {
    private final ITestService testService;

    @Autowired
    public TestController(
            ITestService testService
    ) {
        this.testService = testService;
    }

    @ApiOperation(value = "测试接口")
    @GetMapping("/test")
    public TestVO test() {
        return testService.test();
    }
}
