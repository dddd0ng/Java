package com.swcamp.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 자동형변환 규칙에 대해 이해할 수 있다. */
        byte bNum = 1;          // byte에 대입되는 정수는 처음부터 byte형으로 인지
        short sNum = bNum;
        int iNum = sNum;

        int num1 = 10;
        long num2 = 20;         // 20이 long 형으로 up casting이 일어남

        long result = num1 + num2;

        /* 설명. char형을 int형에 담으면 유니코드 번호를 확인할 수 있다. */
        int uniNum = 'f';
        System.out.println("uniNum: " + uniNum);
        System.out.println("uniNum = " + uniNum);       // soutv(변수 출력 자동완성)
    }
}
