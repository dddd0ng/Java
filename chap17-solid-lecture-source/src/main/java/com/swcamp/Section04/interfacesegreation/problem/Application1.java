package com.swcamp.Section04.interfacesegreation.problem;

/* 설명.
* 인터페이스 분리 원칙(Interface Segregation Principle)
* (쓸모없는 규약은 xxxx,인터페이스도 최대한 추상메소드를 나눠서 구현)
* 자신이 사용하지 않는 메소드에 의존하지 않아야 한다.
* (인터페이스가 너무 많은 규약을 가지면 안된다.)
* */


public class Application1 {
    public static void main(String[] args) {
        BadOldMachine oldPrinter = new BadOldPrinter();
        oldPrinter.print();
        oldPrinter.scan(); // 실제로는 지원하지 않는 기능
        oldPrinter.fax();  // 실제로는 지원하지 않는 기능
    }
}
