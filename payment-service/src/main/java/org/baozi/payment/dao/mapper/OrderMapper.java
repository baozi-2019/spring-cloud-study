package org.baozi.payment.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.baozi.payment.dao.DO.Order;
import org.baozi.payment.dao.DO.OrderExample;
import org.baozi.payment.dao.DO.OrderKey;

public interface OrderMapper {
    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(OrderKey key);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(OrderKey key);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    int upsert(Order record);

    int upsertSelective(Order record);
}