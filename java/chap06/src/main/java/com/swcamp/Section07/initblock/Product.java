package com.swcamp.Section07.initblock;

public class Product {
    //순서1번
    private String name = "아이폰";
    private int price;
    private static String brand;


    /* 설명. 초기화 블럭은 생성자 이전에 실행되며 어떤 생성자로 생성하든
    * 공통적인 로직이 있다면 작성
    * */
    { // 순서3번
        System.out.println("초기화 블럭 실행...");
        name = "갤럭시";
        price = 100;
        brand = "삼성";
    }
 // 순서 2번
    static{ // static만 붙은 블럭에선 non-static은 에러 뜸
//        price = 200; static초기화 블럭에서 인스턴스 변수(non-static)에 접근이 불가능하다
        brand = "현대";
    }

    //순서 4번 => 어지간하면 생성자에 초기화하기
    public Product(){
        System.out.println("Product 기본 생성자 호출됨...");
        brand = "생성자 테스트";
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
