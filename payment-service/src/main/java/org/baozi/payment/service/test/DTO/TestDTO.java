package org.baozi.payment.service.test.DTO;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "TestDTO", description = "测试传输")
public class TestDTO {
    private Long orderId;

    private Date createTime;

    private String outTradeNo;

    private Long customerId;

    private String payPlatform;

    private Long payInfoId;

    private Short totalAmount;

    private Short discountAmount;

    private Short payAmount;

    private Short refundAmount;

    private String orderRemark;

    private Date updateTime;
}
