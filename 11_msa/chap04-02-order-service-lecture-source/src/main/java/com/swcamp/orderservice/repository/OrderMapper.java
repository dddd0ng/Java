package com.swcamp.orderservice.repository;

import com.swcamp.orderservice.aggregate.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    // 해당주문,주문한 내역까지 담는것, 1:N관계지만 한번에 담아내기위해 join이 들어감
    List<Order> selectOrderByUserId(int userId);
}
