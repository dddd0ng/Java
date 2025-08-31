package com.swcamp.Section02.lifecycle;

import org.junit.jupiter.api.*;

public class LifeCycleAnnotationTest {

    /* 설명.
    * 모든 테스트 메소드와 라이프사이클 관련 메소드는 abstract이면 안되고,
    * void 반환형으로 작성해야 한다.
    * 접근 제어자는 사용해도 되지만(default), private이면 안된다.
    * BeforeAll, AfterAll은 static이여야 한다.
    * */


    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all");
    }

    //mock은 "모방하다" 또는 "가짜로 만들다"는 뜻
    //목업(Mock Up)은 본격적으로 제품을 만들기 전에
    //테스트나 전시 등의 목적으로 실물과 똑같이 만든 모형을 의미
    //각각의 테스트 메소드가 실행되기 전에 목업(mock up) 데이터를 미리 세팅해 줄 목적으로 사용
    @BeforeEach
    public void beforeEach(){
        System.out.println("before each");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }
//test붙은 애들만 옆에 초록색 화살표 있음
    @Test
    public void test2(){
        System.out.println("test2");
    }

    //각각의 테스트 메소드가 동작한 이후 사용한 자원을 반납/해제할 목적으로 사용됨
    @AfterEach
    public void afterEach(){
        System.out.println("after each");
    }

    //All붙은 애들은 static 붙음
    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }
}
