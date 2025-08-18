package com.swcamp.Section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /* 설명. Stack에 대해 이해하고 사용 할 수 있다.*/
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        System.out.println("integerStack = " + integerStack);
        System.out.println("peek() : " + integerStack.peek()); // top이 보임(맨 위에꺼, 현재 5)

        /* 설명. search()는 위에서부터 몇 번째에 있는 것인지를 확인 할 수 있다.*/
        System.out.println("위에서 두번째 : "+integerStack.search(2));
        System.out.println("integerStack = " + integerStack);

        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
//        System.out.println("pop() : " + integerStack.pop()); //EmptyStackException 에러뜸


    }
}
