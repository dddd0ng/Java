package com.swcamp.userservice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

//Spring security 모듈 추가 후 default 로그인 페이지 제거 및 인가 설정
@Configuration
public class WebSecurity {
    //최근에는 Bean으로 하는 방식을 씀
    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {
//csrf 토큰을 사용하지않겠다는 코드
        http.csrf(csrf->csrf.disable());
        http.authorizeHttpRequests(authz->
                authz.requestMatchers("/**").permitAll()
                        .requestMatchers(HttpMethod.GET,"/**").permitAll()
                        .requestMatchers("/**").permitAll()
                        .anyRequest().authenticated()
        );

        /* 설명. Session 방식이 아닌 JWT Token(Json Web Token) 방식을 사용*/

                return http.build();

    }

}
