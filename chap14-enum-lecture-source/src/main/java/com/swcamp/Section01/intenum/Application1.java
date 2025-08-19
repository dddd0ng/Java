package com.swcamp.Section01.intenum;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 설명. 단순 정수 열거 패턴과 이러한 패턴들의 단점을 이해 할 수 있다.(enum 아닐때)*/

        int subject1 = Subject.JAVA; // 0
        int subject2 = Subject.HTML; // 0

        /* 설명. 둘 다 같은 상수이자 숫자일 뿐 구분 할 수 없음(런타임 시점)*/
        if (subject1 == subject2) { // 둘다 0이라 같다고 나옴
            System.out.println("두 과목은 같은 과목이다.");
        }

        System.out.println("=================");
        /* 설명. 변수명에 쓰인 이름(과목명)을 충분히 활용 할 수 없다.(숫자로만 처리되기 때문)*/
        Scanner sc = new Scanner(System.in);
        System.out.println("과목 번호를 입력하세요(0~2) : ");
        int fieldNo = sc.nextInt();

        String subName = "";
        switch (fieldNo) {
            case Subject.JAVA: subName = "JAVA"; break; // 런타임 시점에선 0
            case Subject.MARIADB: subName = "MARIADB"; break; // 런타임 시점에선 1
            case Subject.JDBC:subName = "JDBC";break; // 런타임 시점에선 2
        } // 선택한건 잘 나오는데 나머지 3개를 더 처리못함, 숫자로만 처리하고 이름으로는 처리하지않아서
        System.out.println("선택한 과목명은 : " + subName + "입니다.");

        /* 설명. 같은 클래스에 속한 상수들을 순회(반복지/반복문)할 수 없다.*/
        // (필드가 총 몇개이고, 어떤 것들이 있는지)

        /* 설명. 타입 안정성을 보장 할 수 없다.*/
        printSubject(Subject.JAVA);
        printSubject(10);
    }
    private static void printSubject(int java) {
    }

}
