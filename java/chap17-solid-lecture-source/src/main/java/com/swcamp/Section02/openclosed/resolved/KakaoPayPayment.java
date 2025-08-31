package com.swcamp.Section02.openclosed.resolved;

public class KakaoPayPayment implements Payment {
    @Override
    public void process() {
        System.out.println("카카오페이로 결제 처리");
    }
}
