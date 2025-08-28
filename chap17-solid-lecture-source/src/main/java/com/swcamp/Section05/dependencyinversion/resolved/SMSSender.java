package com.swcamp.Section05.dependencyinversion.resolved;

public class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS 발송 : "+message);
    }
}
