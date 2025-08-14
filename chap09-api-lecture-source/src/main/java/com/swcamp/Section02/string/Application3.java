package com.swcamp.Section02.string;

public class Application3 {
    public static void main(String[] args) {
        /* 설명. String 클래스의 자주 사용하는 메소드를 숙지하고 응용할 수 있다.*/
        /* 설명. 1.charAt()*/
        String str1 = "apple";


        for (int i = 0; i <str1.length() ; i++) {
            System.out.println("charAt (" + i + ") : "+ str1.charAt(i));

        }
        /* 설명. 2.compareTo():문자열의 차이를 양수, 0 , 음수로 반환(용도는 정렬)*/
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "mariaDB";
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str4));
        System.out.println((int)'j');
        System.out.println((int)'J');
        System.out.println(str3.compareTo(str5));
        System.out.println((int)'m');

        /* 설명. 3.concat()*/
        System.out.println("concat(): "+str2.concat(str5));

        /* 설명. 4.indexOf() 왼쪽에서부터 */
        String str6="java mariaDB";
        System.out.println("indexOf('a'): " +str6.indexOf('a'));
        System.out.println("indexOf('z'): " +str6.indexOf('z'));
        
        /* 설명. 2번 인덱스 부터 우측으로 'a'를 찾아서 발견한 위치의 index값 반환*/
        System.out.println("indexOf('a, 2'): " +str6.indexOf('a','2'));


        /* 설명. 5.trim()*/
        String trimStr = "        java      ";
        System.out.println("trimStr: #"+trimStr + "#");
        System.out.println("trim: #"+trimStr.trim() + "#");

        /* 설명. 6. toLowerCase() / toUpperCase()*/
        String caseStr = "javamariaDB";
        System.out.println("toLowerCase(): "+ caseStr.toLowerCase());
        System.out.println("toUpperCaseCase(): "+ caseStr.toUpperCase());

        /* 설명. 7. substring()*/
        String javamariaDB = "javamariaDB";
        System.out.println("substring(3, 6) :  = " + javamariaDB.substring(3,6));
        System.out.println("substring(3) :  = " + javamariaDB.substring(3));

        /* 설명. 8. replace()*/
        System.out.println("replace() :  = " + javamariaDB.replace("java", "phyton"));
        System.out.println("javamariaDB: " + javamariaDB);


        /* 설명. 9. length()*/
        System.out.println("length() : " + javamariaDB.length());
        System.out.println("빈 문자열의 길이 : " + "".length());

        /* 설명. 10. isEmpty()*/
        System.out.println("isEmpty(): " + "".isEmpty());
        System.out.println("isEmpty(): " + "abc".isEmpty());

        /* 설명. 11.startWith()*/
        System.out.println("startWith() : "+"abcdef".startsWith("ab"));

    }
}
