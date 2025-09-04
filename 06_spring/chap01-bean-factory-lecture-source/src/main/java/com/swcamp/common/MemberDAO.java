package com.swcamp.common;

import org.springframework.stereotype.Component;

//한방에 bean이 되는걸 인식
//스프링 컨테이너가 객체->기본생성자
//스프링이 기본생성자를 호출하는것임
//기본생성자는 안써도 인식이되지만 매개변수 있는 생성자를 만들면 기본생성자는 만들지않음
// 문제가 발생 할 수 있어서
@Component
public class MemberDAO {
    public MemberDAO() {
        System.out.println("bean될 때 이거 쓰나? 테스트");
    }
}
