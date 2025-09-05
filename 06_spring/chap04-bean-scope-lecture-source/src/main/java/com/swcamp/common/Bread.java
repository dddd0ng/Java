package com.swcamp.common;

import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class Bread extends Product {
    private java.util.Date bakedDate; //생성시간

    public Bread(String name, int price, Date bakedDate) {
        super(name, price);
        this.bakedDate = bakedDate;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "bakedDate=" + bakedDate +
                '}';
    }

}
