package com.swcamp.chap01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    //이제부터 컨테이너 수동으로 작성 할 필요 없지만 컨피규레이션 사용해서 빈
    @Value("${test.value}")
    public String testValue;

    @Value("${test.age}")
    public String testAge;

    /* 설명. @Value는 시스템 환경변수도 불러올 수 있다.*/
//
//    @Value("${username}")
//    public String username;
//시스템 변수에서도 값을 가져옴 (환경변수도)

    @Bean
    public Object propertyReadTest(){
        System.out.println("test value: " + testValue);
        System.out.println("testAge = " + testAge);
//        System.out.println("username = " + username);

        return new Object();
    }
}

