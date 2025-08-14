package com.swcamp.section01.conditional;

import java.util.Scanner;

public class D_test {
        public void testNestedIfElseStatement() {

            Scanner sc = new Scanner(System.in);
            System.out.println("학생의 이름을 입력해주세요 : ");
            char c = sc.next().charAt(0);
            System.out.println("학생의 점수를 입력해주세요 : ");
            int input = sc.nextInt();
            String grade = "";
               if(input>=95){
//               System.out.println(c+"학생은"+"A+학점입니다");
                   grade="A+";
               }
               else if(input>=90)
               {
//                    System.out.println(c+"학생은"+"A학점입니다");
                   grade="+";
               }
               else if(input>=85){
//                    System.out.println(c+"학생은"+"B+학점입니다");
                   grade="B+";
               }
               else if(input>=80) {
//                    System.out.println(c+"학생은"+"B학점입니다");
                   grade="B";
               }
               else if(input>=75) {
//                   System.out.println(c+"학생은"+"C+학점입니다");
                   grade="C+";
               }
               else if(input>=70) {
//                   System.out.println(c+"학생은"+"C학점입니다");
                   grade="C";
               }
               else if(input>=65) {
//                   System.out.println(c+"학생은"+"D+학점입니다");
                   grade="D+";
               }
               else if (input>=60) {
//                   System.out.println(c+"학생은"+"D학점입니다");
                   grade="D";
               }
               else //                   System.out.println(c+"학생은"+"F학점입니다");
                    grade = "F";
            System.out.println(c+"학생의 점수는"+input+"점이고, "+ "등급은"+grade+"입니다.");
            System.out.println("프로그램을 종료합니다.");
           }
            /* 설명.
             *  ohgiraffers 대학의 김XX 교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는
             *  채점방식을 사용하고 있다.
             *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D', 마지막으로
             *  60점 미만인 경우에는 'F'를 학점으로 주게 된다.
             *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
             *  (추가로, 각 등급의 중간점수(95, 85, 75...) 이상인 경우 '+'를 붙여서 등급을 세분화 해보자.)
             *
             * 설명.
             *  출력 예시: XXX 학생의 점수는 86점이고, 등급은 B+입니다.
             *            프로그램을 종료합니다.
             * */

    }


