package com.swcamp.Section03.liskovsustitution.resolved;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
//        return side*side;

    return (int)Math.pow(side, 2); //pow<-제곱 side,3이면 3제곱
    }
}
