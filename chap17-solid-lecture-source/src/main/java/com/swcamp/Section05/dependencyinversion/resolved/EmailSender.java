package com.swcamp.Section05.dependencyinversion.resolved;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("이메일 발송 : "+message);
    }
}
