package com.swcamp.section01.javaconfig;

import com.swcamp.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    // 이 메서드 특징 -> bean을 생성하기 위해 스프링이 쓰게끔 제공
    //컨피규레이션 안에있는 -> 빈. 스프링이 알아서 호출, 알아서 콩으로 만듦
    //메서드 이름= 콩 이름이 됨.
    /* 설명. 메소드명이 기본 bean의 이름이 되고, 다른 이름을 하고싶으면
     * 어노테이션에 이름을 작성 할 수 있다.*/
    @Bean(name = "member")//(name="변경할이름->(메서드이름=콩이름)")
    public MemberDTO getMember(){
        return new MemberDTO(1,"user01","pass01","홍길동");
        //이렇게 콩으로 볶고나면 3가지 방식으로 꺼낼 수 있음
    }
}
