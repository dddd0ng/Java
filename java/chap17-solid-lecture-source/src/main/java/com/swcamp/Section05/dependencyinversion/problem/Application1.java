package com.swcamp.Section05.dependencyinversion.problem;

/* 설명. 의존성 역전 원칙(Dependency Inversion Principle)
* 자식에게 의존하면 자식때문에 휘둘림
* 고 수준 모듈은 저 수준 모듈에 의존해서는 안된다. (둘 다 추상화에 의존해야 한다)
* 추상화는 세부 사항에 의존해서는 안된다. 세부 사항이 추상화에 의존해야 한다.
* */


public class Application1 {
    public static void main(String[] args) {
        BadNotificationService badService = new BadNotificationService();
        badService.sendNotification(1,"중요 공지사항입니다.");
        //1은 email
        badService.sendNotification(2,"중요 공지사항입니다.");
        //2는 SMS
    }
}
