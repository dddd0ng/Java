package com.swcamp.Section02.openclosed.resolved;

/* 설명.
* Payment 인터페이스를 통해 새로운 결제 수당늘 기존 코드의 수정 없이 쉽게 추가 할 수 있다.
* PaymentProcessor 클래스는 구체적인 결제 방식을 알 필요 없이 Payment 인터페이스만 의존한다.
*
* */


public class Application1 {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(new CreditCardPayment());
        paymentProcessor.processPayment(new KakaoPayPayment());
        paymentProcessor.processPayment(new NeverPayPayment());
    }
}
