package com.swcamp.Section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* 설명. 컬렉션 프레임워크에 대해 이해 할 수 있다.(List 계열부터)*/

        /*크기를 지정 할 필요 x
         * 경우에 따라 다양한 자료형 가능 (feat.Object) // Object[] <=아무 타입이나 다 들어감
         * 출력이 용이함(feat. Arrays.toString()이런거 안써도 됨, 변수명 출력하면 다 나옴
         * 배열과 달리 추가, 수정, 삭제가 용이함*/

        /* 배열보다 ArrayList가 좋은점
        * 미리 크기를 할당 할 필요가 없음
        * 들어있는 값(데이터)의 갯수를 잘 파악 할 수 있다.size()
        * 경우에 따라(제네릭 타입을 생략하면) 다양한 값을 한 번에 저장 할 수 있음 (Object[]과 별로 큰 차이 없음)
        * 중간에 값을 추가, 수정, 삭제가 편리함 (feat. 속도는 다소 느릴 수 있음)
        * */

        // Arraylist<Object> list = new ArrayList(); <= <>를 안쓰면 <Object>를 쓴것과 동일
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(new java.util.Date());

        System.out.println("list = " + list); // object로 이뤄져있어서 동적바인딩(오버라이딩 돼있음)

        /* 설명. 넣은 데이터의 순서에 맞게 인덱스로 추출*/
        System.out.println("처음 넣은 값 : " + list.get(0)); // 인덱스만 넣으면 됨
        System.out.println("두번째에 넣은 값 : " + list.get(1)); // 인덱스만 넣으면 됨
        System.out.println("세번째에 넣은 값 : " + list.get(2)); // 인덱스만 넣으면 됨

        /* 설명. 넣은 데이터의 양(size)*/
        System.out.println(list.size()); // length X

        list.add(1,"test");
        System.out.println("list = " + list); // 1번째 인덱스에 test add

        list.set(1,"banana test");
        System.out.println("list = " + list); // 1번째 인덱스 test=> banana test로 수정
        
        list.remove(1);
        System.out.println("list = " + list); // 1번째 인덱스 삭제


        /* 설명. ArrayList를 활용한 정렬*/
        // 문자열 데이터 정렬(feat. 오름차순)
//ArrayList<String> stringList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
//        List<String> stringList = new LinkedList<>(); // 내림차순하려면 LinkedList 사용해야함
        // 필수는 아니지만, 관례상 컬렉션은 다형성을 주로 적용한다.
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println("문자열 데이터 : "+ stringList);

        /* 설명. 실제로는 ArrayList 안에 있는 데이터인 String에 정의된 기준(오름차순)대로 정렬 됨*/
        Collections.sort(stringList);
        System.out.println("오름차순 정렬 된 문자열 데이터 : "+ stringList);
        //정렬이 Collections때매 되는게 아니라, <String>때문에 되는것. (compareTo)

        // 내림차순은 방법이 많음
        /* 설명. 내림차순 하는 방법*/ // List<String> stringList = new LinkedList<>();=>LinkedList사용해야함(ArrayList 쓰면 에러남)
//        Iterator<String> iter = ((LinkedList<String>)stringList).descendingIterator();
//        while (iter.hasNext()){
//            System.out.print(iter.next() + " ");
//        }
    }
}
