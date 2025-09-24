package com.swcamp.userservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class AppConfig {
    /* 설명. DTO <-> DTO <-> Entity, 필요한 순간에 의존성 주입을 받기 위해 bean으로 등록*/
    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

    // BCrypt 단방향 암호화를 위해 bean 등록
    //bean을 쓰는곳은 모든곳(전역)에서 사용 가능(서비스,컨트롤러 계층 등)
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
