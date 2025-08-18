package com.swcamp.Section02.set.run;

import java.util.*;

public class Application3 {
    public static void main(String[] args) {
        /* 설명. TreeSet에 대해 이해하고 활용 할 수 있다.*/
        Set<String> tSet = new TreeSet<>();
        tSet.add("ramen");
        tSet.add("pork");
        tSet.add("kimchi");
        tSet.add("firedEgg");
        tSet.add("firedEgg");
        tSet.add("soup");

        //정렬된 데이터가 들어가있음
        Iterator<String> iter = tSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next() +" ");
        }

        /* 설명. 로또 번호 발생기*/
        // 1부터 45까지 중복되지않고 오름차순 정렬된 6개의 번호 발생하기
        Set<Integer> lotto = new TreeSet<>();

        while(lotto.size() < 6) {
            lotto.add((int)(Math.random() * 45) + 1);
        }
            System.out.println("lotto= " + lotto);

        /* 설명. 배열을 활용해서 같은 로또 번호 발생기를 만들어 보자(feat.정렬 빼고)*/
        int[] arr = new int[6];
        int random = 0;
        for (int i = 0; i < arr.length; i++) {
            random = (int)(Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if(random == arr[j]) {
                    i--;
                    break;
                }
            }
            arr[i] = random;
//            System.out.print(arr[i]+ " ");
        }
        Arrays.sort(arr); // 오름차순

        System.out.println(Arrays.toString(arr));

    }
}
