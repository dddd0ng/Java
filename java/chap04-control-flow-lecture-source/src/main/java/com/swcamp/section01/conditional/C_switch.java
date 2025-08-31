package com.swcamp.section01.conditional;
import java.util.Scanner;

public class C_switch {
    public void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);

        /* 설명. 골드(G), 실버(S), 브론즈(B) 등급별 초기 점수 부여 */
        System.out.print("본인의 등급을 입력하세요(G, S, B): ");
        char grade = sc.next().charAt(0);
//        char grade = "Gold".charAt(0);
        System.out.println(grade);

        int point = 0;
        switch (grade) {
            case 'G':
                point += 100;
                break;
            case 'S':
                point += 50;
                break;
            case 'B':
                point += 30;
                break;
            default:
                System.out.println("입력을 잘 보고 해주세요.");
        }

        System.out.println("회원님께 부여된 초기 포인트는 " + point);
    }
}