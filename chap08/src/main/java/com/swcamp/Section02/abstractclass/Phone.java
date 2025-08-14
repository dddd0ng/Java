package com.swcamp.Section02.abstractclass;

public class Phone extends Product {

    public Phone() {
        super();
    }


    @Override
    public void abstractMethod(){
        System.out.println("안빼먹고 오버라이딩 잘됐다");
    }
}
