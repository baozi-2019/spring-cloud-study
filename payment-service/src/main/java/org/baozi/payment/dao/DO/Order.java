package org.baozi.payment.dao.DO;

import java.util.Date;

public class Order extends OrderKey {
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

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getPayPlatform() {
        return payPlatform;
    }

    public void setPayPlatform(String payPlatform) {
        this.payPlatform = payPlatform == null ? null : payPlatform.trim();
    }

    public Long getPayInfoId() {
        return payInfoId;
    }

    public void setPayInfoId(Long payInfoId) {
        this.payInfoId = payInfoId;
    }

    public Short getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Short totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Short getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Short discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Short getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Short payAmount) {
        this.payAmount = payAmount;
    }

    public Short getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Short refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}