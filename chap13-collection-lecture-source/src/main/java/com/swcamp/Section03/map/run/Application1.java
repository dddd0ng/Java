package com.swcamp.Section03.map.run;

import com.swcamp.Section01.list.dto.BookDTO;

import java.util.HashMap;
import java.util.Map;

public class Application1 {
    public static void main(String[] args) {
        /* 설명. Map의 자료구조에 대해 이해하고 HashMap을 이용 할 수 있다.*/
        //key를 활용하는게 좋음
        /* 설명. key가 중복되는 경우*/
        Map<Object, Object> hMap = new HashMap<>();
        hMap.put(new String("one"), new java.util.Date());
        hMap.put(12,"red apple");
        hMap.put(33,123.0);

        /* 설명. Key로 쓰인 객체는 e,h(equals, hashCode)를 통해 동등함이 판별되면 같은 Key로 취급
        (E,h반드시 둘 다 오버라이딩 되어야 함)*/
        System.out.println("키가 \"one\"만 String으로 value를 추출한다면 : "+ hMap.get(new String("one")));
        // new를 쓴 이유 => 동등하면 같은 key

        System.out.println("hMap = " +hMap);

        //오버라이딩이 안되어있어서 둘다 출력되는데 오버라이딩 되면 하나만 출력.
        /* 설명. Key값은 결국 동등 객체면 같은 Key값으로 보고
        같은 Key를 가진 이후에 들어간 Entry(K+V)가 이전것을 덮어씌움 */

        hMap.put(new BookDTO(1,"홍길동전", "허균", 50000), 10);
        hMap.put(new BookDTO(2,"홍길동전", "허균", 50000), 20); // 중복된 키면 덮어씌우니 주의하기
        //같은 키값이면 맨 뒤에가 앞을 덮어씌움
        System.out.println("hMap = " + hMap);
        System.out.println("20 꺼내쓰기 : " + hMap.get(new BookDTO(2,"홍길동전","허균",50000)));

        /* 설명. Value가 중복되는 경우*/
        hMap.put(44,128.0);
        System.out.println("value가 중복되는 경우 " + hMap);
    }
}
