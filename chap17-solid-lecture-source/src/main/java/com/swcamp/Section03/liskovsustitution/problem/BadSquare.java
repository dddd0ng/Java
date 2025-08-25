package com.swcamp.Section03.liskovsustitution.problem;

//오버라이딩 할 때 잘해야함
public class BadSquare extends BadRectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // LSP 위반
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height); // LSP 위반
    }
}
