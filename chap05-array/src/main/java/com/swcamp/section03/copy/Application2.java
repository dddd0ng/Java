package com.swcamp.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 깊은 복사에 대해 이해할 수 있다. */
        /* 설명.
         *  1. for문을 이용한 수동적인 복사
         *  2. Object의 clone()를 이용한 복사(사용 빈도 높음)
         *  3. System의 arraycopy()를 이용한 복사
         *  4. Arrays의 copyOf()를 이용한 복사
         * */
        int[] originArr = new int[]{1, 2, 3, 4};
        print(originArr, "원본");

        /* 설명. 1. */
        int[] copyArr1 = new int[originArr.length];
        for (int i = 0; i < copyArr1.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1, "for문을 이용한 사본");

        /* 설명. 2. */
        int[] copyArr2 = originArr.clone();
        print(copyArr2, "clone()을 활용한 사본");

        /* 설명. 3. */
        int[] copyArr3 = new int[originArr.length + 3];
        System.arraycopy(originArr, 0, copyArr3, 3, 2);
        print(copyArr3, "arraycopy()를 활용한 사본");

        /* 설명. 4 */
        int[] copyArr4 = Arrays.copyOf(originArr, 3);
        print(copyArr4, "copyOf()를 활용한 사본");
    }

    /* 설명. 1차원 배열과 문자열 설명으로 출력하는 메소드 */
    private static void print(int[] arr, String desc) {
        System.out.println("======= " + desc + " =======");
        System.out.println("넘어온 배열의 hashCode(10진수로 된 주소): " + arr.hashCode());
        System.out.println(Arrays.toString(arr));
    }
}