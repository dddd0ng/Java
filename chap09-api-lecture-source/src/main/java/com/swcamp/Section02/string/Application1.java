package com.swcamp.Section02.string;

public class Application1 {
    public static void main(String[] args) {
        /* 설명. 문자열 객체를 생성하는 다양한 방법을 숙지하고 문자열 인스턴스가 생성되는 방식을 이해 할 수 있다.*/
        /* 설명.
        * 문자열을 만드는 방법 (문자열=객체)
        * 1. ""리터럴 형태:동일한 값을 가지는 문자열 인스턴스(동등(e,h))를 단일 인스턴스로 관리한다.
        *           (일종의 singleton 개념, heap의 상수플(constant pool) 활용)
        * 2. new String(""):매번 새로운 인스턴스를 heap영역에 생성한다.=주소값이 매번 다르다
        * */

/* 설명. 리터럴형태는 */
        String str1="java";
        String str2="java";
        String str3=new String("java");
        String str4=new String("java");
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str2 == str3 : " + (str2 == str3));
        System.out.println("str3 == str4 : " + (str3 == str4));

        System.out.println("str1의 주소" + System.identityHashCode(str1));
        System.out.println("str2의 주소" + System.identityHashCode(str2));
    }

}
