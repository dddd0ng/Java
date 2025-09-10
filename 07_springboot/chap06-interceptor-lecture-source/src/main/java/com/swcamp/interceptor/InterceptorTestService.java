package com.swcamp.interceptor;

import org.springframework.stereotype.Service;
//service+bean
@Service
public class InterceptorTestService {

    //bean을 주입받아서 활용은 가능, 대신 남발하면 계층 무너져서 좋진않음
    public void test() {
        System.out.println("Service bean을 활용한 메소드 호출");


    }
}
