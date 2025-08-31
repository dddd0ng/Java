package com.swcamp.Section03.stringbulider;

public class Application1 {
    public static void main(String[] args) {
        /* 설명. String과 StringBulider(또는 StringBuffer)와의 차이점에 대해 이해하고 사용 할 수 있다.*/
        /* 설명. String은 불변객체(immutable object), StringBuilder(또는 StringBuffer)는 가변객체(mutable object)*/
        //StringBuilder, StringBuffer => synchronize 동기화처리되었다//// asynchronzie 비동기화처리되었다
        
        String testStr = "java";
        StringBuilder testSb = new StringBuilder("kotlin");

        for (int i= 0; i < 20; i++) {
            testStr += i ;
            testSb.append(i);
            System.out.println("String의 경우 : "+ System.identityHashCode(testStr));
            System.out.println("StringBuilder의 경우 : "+ System.identityHashCode(testSb));
        }
        System.out.println("testStr = " + testStr);
        System.out.println("testSb = " + testSb);

        /* 설명. StringBuilder가 가변인 이유*/
        StringBuilder sb2 = new StringBuilder();
        System.out.println("StringBuilder의 초기 용량 : " +sb2.capacity());

        StringBuilder sb3 = new StringBuilder("java");
        System.out.println("StringBuilder의 초기 용량(\"java\") : " +sb3.capacity());

        for (int i = 0; i < 30; i++) {
            System.out.println(sb3);
            sb3.append(i);
            System.out.println(sb3.capacity());
            // 2배 + 2
        }
    }
}
