package com.swcamp.Section05.dependencyinversion.resolved;

public class Application1 {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender SMSSender = new SMSSender();

        NotificationService emailService = new NotificationService(emailSender);
        NotificationService SMSService = new NotificationService(SMSSender);

        emailService.sendNotification("이메일로 발송 될 공지입니다.");
        SMSService.sendNotification("SMS로 발송 될 공지입니다.");

    }
}
