package com.swcamp.Section04.wrapper;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 문자열을 다양한 기본 자료형으로 바꿀 수 있다. */
        /* 설명. valueOf는 반환이 각 Wrapper 클래스 타입의 객체이다.
         *  (auto-unboxing이 되어 기본자료형 대입 가능)
         * */
//        byte b = Byte.valueOf("1");
//        short s = Short.valueOf("2");
//        int i = Integer.valueOf("4");
//        long l = Long.valueOf("8");
//        float f = Float.valueOf("4.0");
//        double d = Double.valueOf("8.0");
//        boolean isTrue = Boolean.valueOf("true");
//        char c = "abc".charAt(0);

        /* 설명. 코테 문제 풀 떄는 아래와 같은 형태가 조금이라도 더 속도 측면에서 유리할 수 있다.
         *  (이유는 기본 자료형을 처음부터 반환해 주어 auto-unboxing을 하지 않기 때문)
         * */
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");
        float f = Float.parseFloat("4.0");
        double d = Double.parseDouble("8.0");
        boolean isTrue = Boolean.parseBoolean("true");
        char c = "abc".charAt(0);
    }
}
