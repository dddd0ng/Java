package com.swcamp.springdatajpa.config;
//전역에서 쓸 bean을 등록하는 설정용

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//설정용이니까 configuration
@Configuration
public class AppConfig {
    //미리 build.gradle에 dependency로 추가해둘것
    //DTO<->Entity매핑을 위한 modelmapper 라이브러리 bean추가
    @Bean
    public ModelMapper modelMapper() {return new ModelMapper();}
    //필수는 아니지만 modelmapper
    //new 연산자를 매번 직접 써야함

}
