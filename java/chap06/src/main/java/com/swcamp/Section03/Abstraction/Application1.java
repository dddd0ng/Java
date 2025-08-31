package com.swcamp.Section03.Abstraction;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarRacer racer = new CarRacer();

        int input = 0;
        do {
            System.out.println("====== 카레이싱 프로그램 ======");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            input = sc.nextInt();
            switch (input) {
                case 1: racer.startUp();
                    break;
                case 2: racer.stepAccelator();
                    break;
                case 3: racer.stepBreak();
                    break;
                case 4: racer.turnOff();
                    break;
                case 9:
                    System.out.println("프로그램을 이용해 주셔서 감사합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        } while (input != 9);
    }
}
