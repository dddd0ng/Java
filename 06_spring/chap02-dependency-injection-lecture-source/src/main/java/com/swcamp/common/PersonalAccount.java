package com.swcamp.common;
//인터페이스를 띄움으로 인해서 설계할때 이점이 많음
public class PersonalAccount implements Account{
//의존은 하고있는데 스프링은 단순 의존하는느낌x
    private final int BANK_CODE; //은행 코드
    private final String ACC_NO; //계좌 번호
    private int balance;         //잔액 (계속 바뀌니까 finalㄴㄴ)


    //객체가 생성됐는데 값이 바뀌면 안되니까 final(신뢰를 위해)

    public PersonalAccount(String ACC_NO, int BANK_CODE) {
        this.ACC_NO = ACC_NO;
        this.BANK_CODE = BANK_CODE;
    }

    @Override
    public String getBalance() {
        return this.ACC_NO + "계좌의 현재 잔액은 " + this.balance + "원 입니다.";
    }

    @Override
    public String deposit(int money) {
        String str = "";

        if(money > 0) {
            this.balance += money;
            str = money + "원이 입금되었습니다";
        } else {
            str = "금액을 잘못 입력하셨습니다.";
        }

        return str;
    }

    @Override
    public String withdraw(int money) {
        String str = "";

        if(this.balance >= money) {
            this.balance -= money;
            str = money + "원이 출금되었습니다.";
        } else {
            str = "잔액이 부족합니다. 잔액을 확인해 주세요";
        }

        return str;
    }

    @Override
    public String toString() {
        return "PersonalAccount{" +
                "BANK_CODE=" + BANK_CODE +
                ", ACC_NO='" + ACC_NO + '\'' +
                ", balance=" + balance +
                '}';
    }
}
