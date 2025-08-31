package com.swcamp.section01.conditional;
import java.sql.SQLOutput;
import java.util.*;

public class A_if {
    public void testSimpleIfStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 한 개를 입력하세요: ");
        int input = sc.nextInt();

        /* 의사코드(pseudo code) : 실제 로직 구현 전에 글로 작성해 보는 것 (틀을 만들어 할 수도 있음)
        * 만약에(입력받은 값이 짝수면){
        *                 "짝수입니다."를 출력 }
        * */
        if(input%2==0){
            System.out.println("짝수입니다.");
        }
    }

    public void testNestedIfStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("양수 하나를 입력해 주세요: ");
        int input = sc.nextInt();
        if(input>0){
        if(input%2==0) {
            System.out.println("입력 받은 값은 양수이면서 짝수입니다.");
        }

        }
        
        /* 설명. 꼭 중첩 if만이 정답은 아니다.*/
        if(input>0&&input%2==0){
            System.out.println("입력 받은 값은 양수이면서 짝수입니다.");
        }
        
    }

}
