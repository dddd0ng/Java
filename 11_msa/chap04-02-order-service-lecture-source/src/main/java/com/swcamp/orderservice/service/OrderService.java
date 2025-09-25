package com.swcamp.orderservice.service;

import com.swcamp.orderservice.dto.OrderDTO;

import java.util.List;

public interface OrderService {

    List<OrderDTO> getOrderByUserId(int userId);
}
