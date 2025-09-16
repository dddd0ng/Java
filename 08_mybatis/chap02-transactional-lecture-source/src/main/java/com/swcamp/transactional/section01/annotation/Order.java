package com.swcamp.transactional.section01.annotation;
//엔터티는 보통 테이블명과 같이 이름을 지어줌

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int orderCode;
    private String orderDate;
    private String orderTime;
    private int totalOrderPrice;
}
