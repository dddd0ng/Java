package com.swcamp.section01.array;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int num3=30;
        int num4=40;
        int num5=50;


        int[] arr = new int[5]; // heap 영역에 [0][0][0][0][0]
        System.out.println(arr[0]);
        System.out.println(arr);

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        int sum=0;
        for (int i = 0; i < 5; i++) {
            arr[i]= 10*(i+1);
            sum += arr[i];
        }/* 설명. 반복문 없이 1차원 배열 입력해보기*/
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

