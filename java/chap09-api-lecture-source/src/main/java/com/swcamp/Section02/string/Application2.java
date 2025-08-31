package com.swcamp.Section02.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 문자열 분리에 대해 이해하고 적용할 수 있다. */
        /* 설명.
         *  문자열을 특정 구분자로하여 분리한 문자열을 반환하는 두 가지 방법
         *  1. split(): 정규표현식을 이용하여 비정형화된 문자열을 분리한다.
         *              (String을 파싱하여 String[]로 반환해주며 대괄호([])를 활용해 여러 구분자 등록 가능)
         *  2. StringTokenizer:
         * */

        /* 설명. 1. split() 활용 */
        String emp1 = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부";       // 주소 X
        String emp3 = "300/이순신?경기도/";       // 부서 X

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("[/?]");

        System.out.println(Arrays.toString(empArr1));
        System.out.println(Arrays.toString(empArr2));
        System.out.println(Arrays.toString(empArr3));


        /* 설명. 2. StringTokenizer 활용 */
        String colors = "red, yellow, green, purple? blue";
        StringTokenizer colorStringTokenizer = new StringTokenizer(colors, ", ?");
        while (colorStringTokenizer.hasMoreTokens()) {

            /* 설명. nextToken()은 단순히 다음 값을 뽑을 뿐 아니라 그 다음칸으로 넘어감을 인지하고
             *      여러번 활용하고 싶으면 변수에 담아서 활용할 것
             * */
            String token = colorStringTokenizer.nextToken();
            System.out.println(token);
            System.out.println(token);
            System.out.println(token);
        }
    }
}