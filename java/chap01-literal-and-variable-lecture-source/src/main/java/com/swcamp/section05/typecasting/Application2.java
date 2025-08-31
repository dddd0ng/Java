package com.swcamp.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 강제 형변환 규칙에 대해 이해할 수 있다. */
        /* 설명.
         *  강제 형변환
         *  : 바꾸려는 자료형으로 캐스팅 연산자((자료형))를 이용하여 형변환한다.
         * */
        long lNum = 8000000000L;
        int iNum = (int)lNum;
        System.out.println("iNum = " + iNum);

        /* 설명. 실수 값을 정수형 자료형으로 강제 형변환 하면 소수점 이하가 소실된다. */
        float avg = 31.235f;
        int floorNum = (int)avg;
        System.out.println("floorNum = " + floorNum);
    }
}
