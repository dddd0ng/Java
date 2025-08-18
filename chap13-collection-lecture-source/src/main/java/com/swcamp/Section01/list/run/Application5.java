package com.swcamp.Section01.list.run;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /* 설명. Queue에 대해 이해하고 활용 할 수 있다.*/
        Queue<String> que = new LinkedList<>(); // Queue는 Interface라서 new Queue안됨
        //인터페이스라 구현하는 하위 타입으로 객체 생성해서 써야 함
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");
        System.out.println("que = " + que);

        System.out.println("que.peek() : " + que.peek());
        System.out.println("que : " + que);

        System.out.println("que.poll() : " + que.poll());
        System.out.println("que.poll() : " + que.poll());
        System.out.println("que.poll() : " + que.poll());
        System.out.println("que.poll() : " + que.poll());
        System.out.println("que.poll() : " + que.poll());
        System.out.println("que.poll() : " + que.poll()); // 더 뽑으면 null값 나옴
        System.out.println("que : " + que);

//        LinkedList<String> que2 = new LinkedList<>(); //LinkedList는 만능 / 덱 (deque)도되고 큐도됨
//        que2.add("first");
//        System.out.println("que2 = " + que2);

        //정렬을 위한 큐, 디폴트가 오름차순
        Queue<Integer> priorityQue = new PriorityQueue<>();
        priorityQue.offer(1);
        priorityQue.offer(5);
        priorityQue.offer(3);
        priorityQue.offer(4);
        priorityQue.offer(2);
        System.out.println("priorityQue = " + priorityQue);
        //왼쪽부터 채워지는 완전 이진트리 구조라서 1,2,3,5,4출력
        //max, min 힙 정렬

        System.out.println(priorityQue.poll());
        System.out.println(priorityQue.poll());
        System.out.println(priorityQue.poll());
        System.out.println(priorityQue.poll());
        System.out.println(priorityQue.poll());

        System.out.println("priorityQue = " + priorityQue);
    }
}
