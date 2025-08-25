package com.swcamp.Section02.openclosed.resolved;

public class CreditCardPayment implements Payment {
    @Override
    public void process() {
        System.out.println("신용카드로 결제 처리");
    }
}
