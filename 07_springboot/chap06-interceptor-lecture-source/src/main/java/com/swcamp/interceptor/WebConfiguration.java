package com.swcamp.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/* 설명. WebMvcConfigurer 관련 설정 : Interceptor추가 및 static(정적)리소스 호출 경로 등록 설정*/
@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    //bean이니까 의존성 주입가능
    private StopwatchInterceptor stopwatchInterceptor;
    @Autowired
    public WebConfiguration(StopwatchInterceptor stopwatchInterceptor) {
        this.stopwatchInterceptor = stopwatchInterceptor;
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(stopwatchInterceptor);
    }
}

//기본적으로 설정용 파일