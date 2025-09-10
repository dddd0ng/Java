package com.swcamp.exceptionhandler;

/* 설명. 사용자 정의형 예외 클래스*/
//extends Exception <= 예외처리
public class MemberRegistException extends Exception {
    public MemberRegistException(String message) {
        super(message); // 사용자 정의 예외처리
    }
}
