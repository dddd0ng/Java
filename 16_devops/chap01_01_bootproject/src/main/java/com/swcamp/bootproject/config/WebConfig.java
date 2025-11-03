package com.swcamp.bootproject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//configuration 백엔드쪽에서 CORS가 적용안댐
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
       registry.addMapping("/**") // origin 이후 요청 경로 패턴
               .allowedOrigins("http://localhost:5173")  // origin 등록
               .allowedOrigins("*")  // origin 등록(어떤 front서버든 상관없이)
               .allowedMethods("GET", "POST", "PUT", "DELETE"); // 

          }
}
