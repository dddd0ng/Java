package com.swcamp.section01.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.swcamp.section01.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ContextConfiguration {

}
