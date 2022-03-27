package org.baozi.payment.api.test;

import org.baozi.common.bean.Response;
import org.baozi.payment.api.test.VO.TestVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;

@FeignClient(value = "payment-service")
public interface ITestClient {
    @PostMapping("/test/t1")
    Response<TestVO> test(@RequestBody LocalDateTime time);

//    class TestClient implements ITestClient {
//
//        @Override
//        public TestVO test() {
//            return new TestVO();
//        }
//    }
}
