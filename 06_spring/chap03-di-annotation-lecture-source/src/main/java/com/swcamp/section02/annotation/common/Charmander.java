package com.swcamp.section02.annotation.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//같은 타입의 bean이 많을 경우, 우선 순위가 있는 bean을 설정 할 수 있다.
//feat. Primary이라는 어노테이션으로
@Primary
//bean만들으려면 component
@Component
public class Charmander implements Pokemon {
    @Override
    public void attack() {
        System.out.println("파이리 불 공격");
    }
}
