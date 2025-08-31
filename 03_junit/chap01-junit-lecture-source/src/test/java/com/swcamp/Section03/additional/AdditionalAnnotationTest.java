package com.swcamp.Section03.additional;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionalAnnotationTest {
    /* 설명. JUnit에서 제공하는 메소드 관련 추가 어노테이션을 사용 할 수 있다.*/
    @Test
    @Disabled //잠깐 테스트 안하고 중지하는.옆에 초록색 화살표 없어짐(테스트 케이스 생략 시)
    public void testIgnore(){

    }
    @Test
    @Timeout(value=1000,unit= TimeUnit.MILLISECONDS)
    //타임아웃 체크 시.1초 내로 테스트 되는지
    public void testTimeout() throws InterruptedException {
    Thread.sleep(900); // try catch말고 Thread.sleep로 예외처리 ,0.9초 시간지연 발생
    }


    //@TestMethodOrder(MethodOrderer.OrderAnnotation.class) 이거 안쓰면 안보임
    /* 설명. 테스트 클래스에 @TestMethodOrder 어노테이션을 추가해서
     * 낮은 숫자가 먼저 동작하게 테스트 코드 작성*/
    @Test
    @Order(1)
    public void testFirst() {}

    @Test
    @Order(3)
    public void testThird() {}

    @Test
    @Order(2)
    public void testSecond() {}

}
