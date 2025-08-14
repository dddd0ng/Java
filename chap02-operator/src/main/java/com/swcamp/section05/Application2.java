package com.swcamp.section05;

public class Application2 {
    public static void main(String[] args) {
        int num1 = 55;
        int num2 = 101;
        System.out.println(num1 >= 1 && num1<=100);
        System.out.println(num2 >= 1 && num2<=100);


        char ch1 = 'a';
        char ch2 = 'A';
        System.out.println(ch1 >= 'A' && ch1 <= 'Z');
        System.out.println(ch2 >= 'A' && ch2 <= 'Z');

        char ch3 = 'y';
        char ch4 = 'Y';
        System.out.println("y를 입력했는지 확인: " + (ch3 == 'y' || ch3 == 'Y'));
        System.out.println("y를 입력했는지 확인: " + (ch4 == 'y' || ch4 == 'Y'));

    }
}
