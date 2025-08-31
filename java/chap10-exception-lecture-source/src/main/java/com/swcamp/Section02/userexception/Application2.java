package com.swcamp.Section02.userexception;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. finally를 활용한 try-catch문을 이해할 수 있다. */
        ExceptionTest et = new ExceptionTest();
        try {
//            et.checkEnoughMoney(2000, 5000);
            et.checkEnoughMoney(-2000, 5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {

            /* 설명. try 블럭에서 예외가 발생하든 발생하지 않던 try 블럭과 관계 된 반드시 실행되어야 할 부분 작성 */
            System.out.println("finally 블럭의 내용 동작함...");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}