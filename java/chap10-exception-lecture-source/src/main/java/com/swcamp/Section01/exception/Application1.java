package com.swcamp.Section01.exception;

public class Application1 {
    public static void main(String[] args) /*throws ArithmeticException*/{

        /* 수업목표. 예외에 대해 이해하고 이를 처리하기 위한 문법을 활용할 수 있다. */
        /* 설명.
         *  1. throws를 통한 위임
         *     메소드를 호출한 대상에 예외가 발생할 수 있음을 알리는 목적과 메소드 안에서 자체적으로
         *     처리하지 않을 때 쓰는 방식
         *  2. try-catch를 통한 처리
         *     try 블럭에서 발생하는 예외를 catch에서 잡아내어 원하는 데로 직접 처리하는 방식
         * */

        ExceptionTest et = new ExceptionTest();

        try {

            /* 설명. try 블럭은 처리 할 예외가 있는 적당한 범위를 감싼다.(feat.트랜잭션의 성격) */
            et.checkEnoughMoney(10000, 50000);
            et.checkEnoughMoney(50000, 10000);    // 예외가 발생하면 try 블럭의 나머지 구간을 건너뜀

            System.out.println("오~ 잔액 많은데?");
        } catch (ArithmeticException e) {

            /* 설명. catch 블럭은 try 블럭에서 발생하는 예외 타입을 매개변수로 가지며 예외를 실질적으로 처리하는 부분
             *   (예외 타입의(Exception을 상속받은) 객체가 제공하는 메소드를 활용)
             * */
//            System.out.println(e.getMessage());
//            System.out.println("예외 처리 부분");

            /* 설명. 예외 메시지와 발생한 문제들을 추적할 수 있게 빨간 글씨의 메시지로 출력하도록 처리하는 메소드 */
//            e.printStackTrace();

            /* 설명. 자바 어플리케이션을 즉시 종료하도록 작성 */
            System.exit(0);
        }

        System.out.println("프로그램을 종료합니다.");
    }
}