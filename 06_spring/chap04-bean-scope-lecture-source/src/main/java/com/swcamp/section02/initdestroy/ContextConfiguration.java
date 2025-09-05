package com.swcamp.section02.initdestroy;

import com.swcamp.common.Beverage;
import com.swcamp.common.Bread;
import com.swcamp.common.Product;
import com.swcamp.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread(){
        return new Bread("붕어빵", 1000, new java.util.Date());
    }

    @Bean
    public Product milk(){
        return new Beverage("딸기우유",1500,500);
    }

    @Bean
    public Product water(){
        return new Beverage("지리산 암반수",3000,1500);
    }

    @Bean
    public ShoppingCart shoppingCart(){
        return new ShoppingCart();
    }


    /* 설명. bean타입의 클래시의 정의된 메소드를 활용해서 bean 생성 및 소멸 시점에 호출 할 수 있다.*/
    @Bean(initMethod="openShop", destroyMethod = "closeShop")
    public Owner owner(){
        return new Owner();
    }


}
//톰캣은 빈 관리 ㄴㄴ 서블릿처럼 보이지만 스프링