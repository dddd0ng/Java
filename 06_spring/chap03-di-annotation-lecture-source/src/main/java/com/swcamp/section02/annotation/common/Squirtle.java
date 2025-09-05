package com.swcamp.section02.annotation.common;

import org.springframework.stereotype.Component;

@Component
public class Squirtle implements Pokemon {
    @Override
    public void attack() {
        System.out.println("꼬부기 물 공격");
    }
}
