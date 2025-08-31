package com.swcamp.section03.math;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. math에서 제공하는 static 메소드를 호출할 수 있다. */
        /* 설명.
         *  참고로, java.lang 패키지에서 제공되는 클래스는 풀클래스명(패키지 포함)이나
         *  import 없이도 짧게 클래스명을 쓸 수 있다.(ex: String, Math, ...)
         * */
        double result = Math.abs(-32.1);
        System.out.println("result = " + result);

        /* 설명. 최대값, 최소값 출력 */
        System.out.println("더 작은 값은? " + Math.min(10, 20));
        System.out.println("더 큰 값은? " + Math.max(10, 20));

        /* 설명. 난수 생성 */
        System.out.println("random() 메소드: " + Math.random());

    }
}