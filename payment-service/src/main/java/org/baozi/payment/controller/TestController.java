package org.baozi.payment.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.baozi.payment.api.test.VO.TestVO;
import org.baozi.payment.service.test.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Api(tags = {"测试*"})
@RestController
@RequestMapping("/test")
public class TestController {
    private final ITestService testService;
    private final DiscoveryClient discoveryClient;
    private final StreamBridge streamBridge;

    @Autowired
    public TestController(
            ITestService testService,
            DiscoveryClient discoveryClient,
            StreamBridge streamBridge
    ) {
        this.testService = testService;
        this.discoveryClient = discoveryClient;
        this.streamBridge = streamBridge;
    }

    @ApiOperation(value = "测试接口")
    @PostMapping("/t1")
    public TestVO test(@RequestBody LocalDateTime time, @RequestParam("p1") String p1) throws InterruptedException {
        System.out.println(time);
        TestVO test = testService.test();
        Thread.sleep(600);
        return test;
    }

    @GetMapping("/send/{message}")
    public String send(@PathVariable("message") String message) {
        streamBridge.send("testOutput-out-0", message);
        return message;
    }

    @GetMapping("/t2")
    public String test2() {
        return "sss";
    }

    @GetMapping("/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        System.out.println(services);
        List<ServiceInstance> instances = discoveryClient.getInstances("payment-service");
        for (ServiceInstance serviceInstance : instances) {
            System.out.println(serviceInstance.getInstanceId() + " - " + serviceInstance.getHost() + " - " + serviceInstance.getPort() + " - " + serviceInstance.getUri());
        }
        return discoveryClient;
    }
}
