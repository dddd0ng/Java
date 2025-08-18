package com.swcamp.Section02.extend;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 제네릭 크래스를 좀 더 활용하는 예제를 이해할 수 있다. */
//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<>();

        /* 설명. <T extends Rabbit>에 의해 Rabbit 및 하위 타입으로만 제네릭 객체가 생성 가능하면
         *  이후에는 객체별 다른 타입일 수 있다.
         * */
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setRabbit(new Rabbit());
        farm4.getRabbit().cry();
        farm4.setRabbit(new Bunny());
        farm4.getRabbit().cry();

//        farm5.setRabbit(new Rabbit());        // 컴파일 에러 발생
        farm5.setRabbit(new Bunny());
        farm5.getRabbit().cry();
    }
}
