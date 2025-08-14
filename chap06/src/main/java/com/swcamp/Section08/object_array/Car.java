package com.swcamp.Section08.object_array;

public class Car {
    private String modelName;
    private int maxSpeed;

    /* 설명. 습관적으로 기본생성자 만들어두기*/
    public Car(){
    }

    public Car(String modelName, int maxSpeed){
        this.modelName=modelName;
        this.maxSpeed=maxSpeed;
    }
    public void driveMaxSpeed(){
        System.out.println(modelName + "차량이 최고 시속" + maxSpeed
                            +"(km/h)로 달립니다.");
    }
}
