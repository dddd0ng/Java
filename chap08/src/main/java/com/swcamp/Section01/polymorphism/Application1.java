package com.swcamp.Section01.polymorphism;

public class Application1 {
    public static void main(String[] args) {
        /* 설명. 다형성과 타입 형변환에 대해 이해할 수 있다.*/
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        Animal an1 = new Animal(); // 다형성 적용 x
        Animal an2 = new Tiger(); // 다형성 적용 o
        Animal an3 = new Rabbit(); // 다형성 적용 o

        Object obj = new Animal();  // 다형성 적용 o

        an2.eat();  // 런타임 시점에는 오버라이딩 된 자식 객체의 메소드가 동작(동적 바인딩[상속+오버라이딩 돼있어함])
        an3.eat();
//        an3.jump(); 컴파일 시점에는 아직 an3는 정적 바인딩만 지원됨
        // an3.jump()    animal에는 jump가 없어서 에러뜸
        ((Rabbit)an3).jump(); // 강제로 알려주면 (강제 다운 캐스팅) 추가 메소드 호출 가능


        /* 설명. Animal은 Tiger 또는 Rabbit 타입이 아니다.(지니고 있지 않다).*/
//        Tiger tr = new Animal(); // 다형성 적용 x

    }
}
