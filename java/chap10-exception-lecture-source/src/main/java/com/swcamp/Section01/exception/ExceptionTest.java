package com.swcamp.Section01.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int balance) throws ArithmeticException{
        System.out.println("가지고 계신 돈은 " + balance + "원 입니다.");

        if (balance >= price) {
            System.out.println(price + "원 상품을 구입하기 위한 금액이 충분합니다.");
            return;
        }

        /* 설명. 정상흐름이 아닌(예외 상황)에 대해 Exception을 상속받은 예외 타입의 객체를 발생 */
        throw new ArithmeticException("호주머니 사정이 딱하군요!");

    }
}