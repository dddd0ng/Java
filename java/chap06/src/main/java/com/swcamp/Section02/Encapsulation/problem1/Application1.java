package com.swcamp.Section02.Encapsulation.problem1;

public class Application1 {
    /* 설명. 필드에 직접 접근하는 경우 발생하는 문제점을 이해 할 수 있다.*/
    public static void main(String[] args) {
        monster monster1 = new monster();
        monster1.name = "드라큘라";
        monster1.hp = 200;

        System.out.println("monster1의 이름 :  " + monster1.name);
        System.out.println("monster1의 체력 :  " + monster1.hp);

        monster monster2 = new monster();
        monster2.name = "프랑켄";
//        monster2.hp = -300;
        monster2.setHp(-300);

        System.out.println("monster1의 이름 :  " + monster2.name);
        System.out.println("monster1의 체력 :  " + monster2.hp);


    }


}
