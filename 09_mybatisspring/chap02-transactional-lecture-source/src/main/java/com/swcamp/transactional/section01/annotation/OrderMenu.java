package com.swcamp.transactional.section01.annotation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class OrderMenu {
    private int orderCode;
    private int menuCode;
    private int orderAmount;
}
