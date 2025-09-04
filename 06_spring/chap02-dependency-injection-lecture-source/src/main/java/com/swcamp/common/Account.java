package com.swcamp.common;
//멤버는 어카운트 클래스에 의존(멤버내에 다른 클래스가 있으므로)
// 클래스로 해도 좋지만 스프링은 간결함을 위해 만들어짐

public interface Account {

    /*  1.잔액 조회*/
    String getBalance();

    /*  2.입금*/
    String deposit(int money); //설계를 추상메서드로

    /*  3.출금*/
    String withdraw(int money);

}
