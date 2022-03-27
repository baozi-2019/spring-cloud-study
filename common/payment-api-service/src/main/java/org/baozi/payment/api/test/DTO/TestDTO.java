package org.baozi.payment.api.test.DTO;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@ApiModel(value = "TestDTO", description = "测试传输")
public class TestDTO implements Serializable {
    private static final long serialVersionUID = -4595088557970996162L;

    private Long orderId;

    private LocalDateTime createTime;

    private String outTradeNo;

    private Long customerId;

    private String payPlatform;

    private Long payInfoId;

    private BigDecimal totalAmount;

    private BigDecimal discountAmount;

    private BigDecimal payAmount;

    private BigDecimal refundAmount;

    private String orderRemark;

    private LocalDateTime updateTime;
}
