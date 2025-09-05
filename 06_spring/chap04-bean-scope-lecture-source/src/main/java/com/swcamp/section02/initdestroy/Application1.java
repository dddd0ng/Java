package com.swcamp.section02.initdestroy;

import com.swcamp.common.Product;
import com.swcamp.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {


    //컨테이너 자체가 자바
    ApplicationContext context=
            new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    /* 설명. 붕어빵, 우유, 물을 진열*/

    Product carpBread=context.getBean("carpBread", Product.class);
    Product milk=context.getBean("milk", Product.class);
    Product water=context.getBean("water", Product.class);


    /* 설명. 첫번째 손님 입장 후 쇼핑 카트를 꺼내 물건을 담는다.*/
    ShoppingCart cart1=context.getBean("shoppingCart", ShoppingCart.class);
        cart1.addItem(carpBread);
        cart1.addItem(milk);

        System.out.println("첫번째 손님의 카트 : " + cart1);

    /* 설명. 두번째 손님 입장 후 쇼핑 카트에 물건을 담는다.*/
    ShoppingCart cart2=context.getBean("shoppingCart", ShoppingCart.class);
        cart2.addItem(water);
        System.out.println("두번째 손님의 카트 : " + cart2);


/* 설명. main메소드 종료 전 Container를 제거 (bean) 재기 강제*/
        ((AnnotationConfigApplicationContext)context).close();





}/*"shoppingCart" <= ContextConfiguration
     @Bean
    public ShoppingCart shoppingCart(){
         return new ShoppingCart();
    }*/


}
