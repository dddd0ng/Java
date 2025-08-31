package com.swcamp.Section02.Encapsulation.problem1;

public class monster {
    String name;
    int hp;

    /* 설명.
    * this.의 의미
    * 1. 변수명이 동일 할 시, 지역변수가 우선적으로 인지되는 것을 방지하기 위해
    * 명시적으로 작성(만약 이름이 다른 변수들이면 작성 생략 가능)
    * 2. non-static 메소드를 호출하는 해당 클래스 타입의 객체로 해석
    *
    *
    * */

    public void setHp(int hp){
        if (hp>=0){
            this.hp = hp;
        }else{
            this.hp = 0;
        }


    }
}
