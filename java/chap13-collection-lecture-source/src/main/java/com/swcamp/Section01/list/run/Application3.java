package com.swcamp.Section01.list.run;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Application3 {
    public static void main(String[] args) {
        /* 수업목표. List 계열을 출력하는 4가지 방법 */
//        List<String> list = new ArrayList<>();    // 내부 배열을 사용하며 값을 조회하는데 용이
//        List<String> list = new LinkedList<>();   // 이중 연결 리스트이며 중간에 값 추가 및 제거에 용이
        List<String> list = new Vector<>();         // ArrayList와 별 차이 없지만 동기화 처리 기능 추가
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("watermelon");
        list.add("pineapple");

        /* 설명. 1. toString() 활용하기 */
        System.out.println("list = " + list);

        /* 설명. 2. for문 활용하기 */
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        /* 설명. 3. for-each문 활용하기 */
        for (String str: list) {
            System.out.print(str + " ");
        }
        System.out.println();

        /* 설명. 4. iterator 활용하기 */
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        /* 설명. 추가 메소드 */
        /* 설명. ArrayList 객체가 지닌 item들을 비움 */
        list.clear();
        System.out.println("list = " + list);

        /* 설명. ArrayList 객체가 item들을 지녔는지 확인 */
        System.out.println("list가 비워졌는지 확인: " + list.isEmpty());
    }
}
