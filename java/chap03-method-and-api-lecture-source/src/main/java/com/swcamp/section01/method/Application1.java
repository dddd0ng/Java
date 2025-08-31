package com.swcamp.section01.method;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 메소드의 호출(Method Call) 흐름에 대해 이해할 수 있다. */
        System.out.println("main() 시작함...");
        Application1.methodA();     // 원래 static 메소드는 클래스명.메소드명() 해야 됨
        methodA();                  // static 메소드가 같은 클래스일 경우 생략 가능
        System.out.println("main() 종료함...");
    }

    public static void methodA() {
        System.out.println("methodA() 호출함...");
        methodB();
        System.out.println("methodA() 종료함...");
    }

    public static void methodB() {
        System.out.println("methodB() 호출함...");

        System.out.println("methodB() 종료함...");
    }
}

