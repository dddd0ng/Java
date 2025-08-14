package com.swcamp.section06.ternary;

public class Application {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = -10;
        String result1 = (num1>0)? "양수다" : "양수가 아니다";
        String result2 = (num2>0)? "양수다" : "양수가 아니다";

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);


        int num3 = 0;
        int num4 = 1;
        int num5 = -1;
        String result3 = (num3 >0)? "양수다" : (num3==0)?"0이다":"홀수다";
        String result4 = (num4 >0)? "양수다" : (num4==0)?"0이다":"홀수다";
        String result5 = (num5 >0)? "양수다" : (num5==0)?"0이다":"홀수다";

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);
    }
}
