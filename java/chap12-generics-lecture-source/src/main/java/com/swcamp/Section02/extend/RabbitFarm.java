package com.swcamp.Section02.extend;

/* 설명. RabbitFarm 제네릭 클래스는 Rabbit 또는 Rabbit 하위 타입으로만 제네릭 타입을 지정할 수 있다. */
public class RabbitFarm<T extends Rabbit> {
    private T rabbit;

    public RabbitFarm() {
    }

    public RabbitFarm(T rabbit) {
        this.rabbit = rabbit;
    }

    public T getRabbit() {
        return rabbit;
    }

    public void setRabbit(T rabbit) {
        this.rabbit = rabbit;
    }
}