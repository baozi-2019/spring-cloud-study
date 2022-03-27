package org.baozi.payment.service.test.impl;

import lombok.extern.slf4j.Slf4j;
import org.baozi.payment.api.test.DTO.TestDTO;
import org.baozi.payment.api.test.VO.TestVO;
import org.baozi.payment.dao.DO.Order;
import org.baozi.payment.dao.DO.OrderExample;
import org.baozi.payment.dao.mapper.OrderMapper;
import org.baozi.payment.service.test.ITestService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class TestService implements ITestService {
    @Resource
    private OrderMapper orderMapper;


    @Override
    public TestVO test() {
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria().andOrderIdEqualTo(1L);
        long count = orderMapper.countByExample(orderExample);
        orderExample.limit(0, 10);
        List<Order> orderList = orderMapper.selectByExample(orderExample);
        List<TestDTO> testDTOList = orderList.stream().map(e -> {
            TestDTO testDTO = new TestDTO();
            BeanUtils.copyProperties(e, testDTO);
            return testDTO;
        }).collect(Collectors.toList());

        return new TestVO(testDTOList, count);
    }
}
