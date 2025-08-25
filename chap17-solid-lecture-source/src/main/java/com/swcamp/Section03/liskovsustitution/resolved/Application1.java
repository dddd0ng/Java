package com.swcamp.Section03.liskovsustitution.resolved;

/* 설명.
* Rectangle과 Square는 다른 부분이 많으니 별도의 타입으로 정의하고
* 공통적인 부분만 인터페이스를 통해 필요한 동작만 추상화하여 LSP를 준수함
* */

public class Application1 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,10);
        System.out.println("직사각형의 넓이 : "+rectangle.getArea());

        Shape square = new Square(5);
        System.out.println("정사각형의 넓이 : "+square.getArea());
    }
}
