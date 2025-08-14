package com.swcamp.section05;

public class logical {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println("'''''''''''''");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println("'''''''''''''");
        System.out.println(!true);
        System.out.println(!false);
        System.out.println("'''''''''''''");
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;

        System.out.println((num1<num2)&&(num3<num4));
        System.out.println((num1<num2)&&(num3>num4));
        System.out.println((num1>num2)&&(num3<num4));
        System.out.println((num1>num2)&&(num3>num4));
    }
}
