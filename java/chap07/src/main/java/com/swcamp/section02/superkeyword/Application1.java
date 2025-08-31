package com.swcamp.section02.superkeyword;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. super.과 super()에 대해 이해할 수 있다. */
        Product product1 = new Product();
        System.out.println(product1);

        Product product2 = new Product("p01", "플레이데이터", "자바"
                , 1000, new java.util.Date());
        System.out.println(product2);

        Computer computer1 = new Computer();
        System.out.println(computer1);

        Computer computer2 = new Computer("퀄컴 스냅드래곤", 512, 16, "안드로이드");
        System.out.println(computer2);

        Computer computer3 = new Computer("p02", "구글", "픽셀", 1000000, new java.util.Date(),
                "퀄컴 스냅드래곤", 1024, 32, "윈도우");
        System.out.println(computer3);
    }
}