package com.swcamp.section03.annotationconfig.subsection02.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        //얘도 컨테이너니까
        ApplicationContext context =
                new GenericXmlApplicationContext("section03/annotationconfig/subsection02/xml/spring-context.xml");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
