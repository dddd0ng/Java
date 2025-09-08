package com.swcamp.section01.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.swcamp.section01.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true) // 이거까지 작성해줘야함
public class ContextConfiguration {

}
