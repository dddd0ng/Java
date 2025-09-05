package com.swcamp.common;

import java.util.ArrayList;
import java.util.List;

//product를 주입받을거
/* 설명. add라는 메소드로 직접 상품을 담을 예정.(feat의존성 주입x)*/
public class ShoppingCart {

    private final List<Product> items;


    public ShoppingCart(List<Product> items) {
        this.items = new ArrayList<Product>();
    }

    /* 설명. 카트에 물품을 담는 기능*/
    public void addItem(Product item){
        this.items.add(item);
    }

    /* 설명. 카트에서 물품을 꺼내는 기능(한방에 다 꺼내기)*/
    public List<Product> getItems() {
        return items;
    }

}
