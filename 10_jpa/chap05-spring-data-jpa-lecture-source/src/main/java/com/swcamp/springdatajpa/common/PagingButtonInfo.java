package com.swcamp.springdatajpa.common;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
//setter 오염된값이 들어갈 수 있어서 어지간하면 setter는 안쓰는게 좋음
public class PagingButtonInfo {
    private int currentPage;
    private int startPage;
    private int endPage;
}
