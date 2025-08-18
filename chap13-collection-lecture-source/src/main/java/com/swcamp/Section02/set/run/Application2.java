package com.swcamp.Section02.set.run;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {
    public static void main(String[] args) {
        /* 설명. LinkedHashSet에 대해 이해하고 활용할 수 있다.*/
        Set<String> lSet = new LinkedHashSet<>();
        
        lSet.add("ramen");
        lSet.add("pork");
        lSet.add("kimchi");
        lSet.add("firedEgg");
        lSet.add("firedEgg");
        lSet.add("soup");
        System.out.println("lSet = " + lSet);

        /* 설명. 저정한 순서를 기억하는 LinkedHashSet*/
        Iterator<String> iter = lSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next()+ " ");
        }
    }
}
