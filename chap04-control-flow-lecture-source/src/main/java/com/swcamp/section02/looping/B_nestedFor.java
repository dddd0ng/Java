package com.swcamp.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {

        /* 설명.
         *  2단
         *   2 * 1 = 2
         *   2 * 2 = 4
         *   ...
         *  9단
         *   9 * 1 = 9
         *   9 * 2 = 18
         *   ...
         *   9 * 9 = 81
         *   ==================
         * */

//        for (int dan = 2; dan <= 9; dan++) {
//            System.out.println(dan + "단");
//            for (int su = 1; su <= 9; su++) {
//                System.out.println(dan + " * " + su + " = " + (dan * su));
//            }
//            System.out.println("=============");
//        }

        /* 설명. 메소드로 extract하며 refactoring 해보기 */
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println(dan + "단");
            printGugudan(dan);
            System.out.println("=============");
        }
    }

    /* 설명. 단수가 넘어오면 해당 단수의 구구단 출력을 담당하는 메소드 */
    private static void printGugudan(int dan) {
        for (int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }


    /* 설명. 별찍기 */
    /* 설명.
     *  양의 정수 하나를 입력하세요: 5
     *      *
     *     **
     *    ***
     *   ****
     *  *****
     * */
    public void testForExample() {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 하나를 입력하세요: ");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {

            /* 설명. 공백찍기 */
            printSpace(input, i);

            /* 설명. 별찍기 */
            printStar(i);

            System.out.println();
        }
    }

    private static void printStar(int i) {
        for (int j = 0; j < i + 1; j++) {
            System.out.print("*");
        }
    }

    private static void printSpace(int input, int i) {
        for (int j = 0; j < input - (i + 1); j++) {
            System.out.print(" ");
        }
    }
}