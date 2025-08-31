package com.swcamp.Section02.openclosed.resolved;

public class NeverPayPayment implements Payment {
    @Override
    public void process() {
        System.out.println("네이버페이로 결제 처리");
    }
}
