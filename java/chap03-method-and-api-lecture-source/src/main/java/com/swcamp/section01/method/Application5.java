package com.swcamp.section01.method;

public class Application5 {
    public static void main(String[] args) {

        /* 수업목표. 메소드의 리턴에 대해 이해할 수 있다. */
        Application5 app5 = new Application5();
        app5.testMethod();
        String returnStr = app5.returnMethod();
        System.out.println("returnStr = " + returnStr);

        /* 설명. 굳이 꼭 반환값은 변수에 담지 않아도 된다. */
        System.out.println("반환값 바로 확인 = " + app5.returnMethod());
    }

    /* 설명. 반환이 없는 경우 */
    public void testMethod() {
        System.out.println("testMethod() 동작 확인...");

        return;
    }

    /* 설명. 반환을 String으로 하는 경우 */
    public String returnMethod() {
        System.out.println("returnMethod() 동작 확인...");

        return "test";
    }
}