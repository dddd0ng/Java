package com.swcamp.Section03.Abstraction;

public class CarRacer {

    private Car myCar = new Car();

    public void startUp() {
        this.myCar.startUp();
    }

    public void stepAccelator() {
        this.myCar.go();
    }

    public void stepBreak() {
        this.myCar.stop();
    }

    public void turnOff() {
        this.myCar.turnOff();
    }
}