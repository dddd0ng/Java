package com.swcamp.section03.properties.subsection01;

import com.swcamp.common.Beverage;
import com.swcamp.common.Bread;
import com.swcamp.common.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("section03/properties/subsection01/product-info.properties")
public class ContextConfiguration {

    /* 설명. 의존성 주입(di)이랑은 좀 다름
    * di와는 별개로 외부 리소스로부터 키값을 활용해
    * 밸류를 불러와 변수에 대입이 가능하다.
    * 1.코드 상에서 실제 대입되는 값을 숨길 수 있음
    * 2.외부 리소스 수정을 통해 서버가 중단되지 않고도 설정이 수정 될 수 있다.
    *  */
    @Value("${bread.carpbread.name}") //설정파일로부터 불러옴
    private String carpBreadName;

    @Value("${bread.carpbread.price}")
    private int carpBreadPrice;

    @Value("${beverage.milk.name}")
    private String milkName;

    @Value("${beverage.milk.price}")
    private int milkPrice;

    @Value("${beverage.milk.capacity}")
    private int milkCapacity;


    @Bean
    public Product carpBread(){
        return new Bread(carpBreadName, carpBreadPrice, new java.util.Date());
    }

    @Bean
    public Product milk(){
        return new Beverage(milkName, milkPrice, milkCapacity);
    }

    @Bean
    public Product water(@Value("${beverage.water.name}") String waterName,
                         @Value("${beverage.water.price}")int waterPrice,
                         @Value("${beverage.water.capactiy}") int waterCapacity){
        return new Beverage(waterName, waterPrice, waterCapacity);
    }





}
