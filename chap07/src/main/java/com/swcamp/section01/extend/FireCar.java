package com.swcamp.section01.extend;

public class FireCar extends Car {
/* 설명. 자식 클래스의 생성자*/

    public FireCar(){
        super(); // 안적어도 자동 작성 됨(모든 클래스가)
        System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
    }
    
    
    /* 설명. 부모로부터 물려받은 메소드가 아닌 자식이 추가한 메소드*/
    public void sprayWater(){
        System.out.println("불난 곳을 찾았습니다. 물을 뿌립니다. ==========3");

    }
}
