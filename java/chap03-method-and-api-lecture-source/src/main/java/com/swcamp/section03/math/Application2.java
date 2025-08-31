package com.swcamp.section03.math;

public class Application2 {
    public static void main(String[] args) {
        /* 설명. 0 ~ 9까지 난수 생성*/
        int random1 = (int)(Math.random() * 10);
        System.out.println("0~9난수 랜덤생성 : " + random1);
        /* 설명. 80 ~ 100까지 난수 생성*/
        int random2 = (int)(Math.random() * 21)+80;
        System.out.println("80~100난수 랜덤생성 : " + random2);
        /* 설명. -188 ~ 10까지 난수 생성*/
        int random3 = (int)(Math.random() * 199)+(-188);
        System.out.println("-188~10난수 랜덤생성 : " +random3);
    }
}
