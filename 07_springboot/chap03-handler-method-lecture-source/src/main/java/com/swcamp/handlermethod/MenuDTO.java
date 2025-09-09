package com.swcamp.handlermethod;

import lombok.*;

//맵 대신 dto로 받아냄
//핸들러 요청 한방에 받아낼 객체 - 커맨더 객체
@NoArgsConstructor      //스프링이 사용 할 생성자(Constructor)
@AllArgsConstructor
@Getter
@Setter                 //스프링이 사용 할 setter
@ToString

/* 설명. 사용자의 요청 파라미터를 담기 위한 용도의 커맨드 객체용 클래스*/
public class MenuDTO {
    //사용자가 넘기는 parameter의 키 값과 일치하게 필드명 작성해줘야함
    private String name;
    private int price;
    private int categoryCode;
    private String orderableStatus;
    //db랑도 생각하면서 연동되게끔
}
