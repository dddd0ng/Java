package com.swcamp.assertions.Section02.assertj;


import com.swcamp.assertions.Section01.jupiter.NumberValidator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class AssertJTest {
    /* 설명. test 작성을 위한 3rd party lib 중 AssertJ의 사용법에 대해 이해 할 수 있다.*/
    /* 1.문자열 테스트 하기*/
    @Test
    @DisplayName("문자열 테스트하기")
    void testStringValidation(){
        //given
        String expected = "hello world";

        //when
        String actual = new String(expected);

        //then
        Assertions.assertThat(actual)
                .isNotEmpty()           //문자열이 비어있지 않은지
                .isNotBlank()            //문자열이 공백이 아닌 문자열이 포함되어 있는지
                .contains("Hello")
                .doesNotContain("hahaha")
                .startsWith("h")
                .endsWith("d")
                .isEqualTo(expected);

    }

    /* 2. 숫자 테스트하기*/
    @Test
    @DisplayName("숫자 테스트 하기")
    void testIntegerValidation(){
        double pi = Math.PI;

        Double actual = pi;

        Assertions.assertThat(actual)
                .isPositive()
                .isGreaterThan(3)
                .isLessThan(4)
                .isEqualTo(Math.PI);
    }

    /* 3.날짜 테스트하기*/
    @Test
    @DisplayName("날짜 테스트하기")
    void testLocalDateTimeValidation(){
        String birthday = "2014-09-18T16:42:00.000";

        LocalDateTime theDay = LocalDateTime.parse(birthday);

        //형태 YYYY-MM-DDTHH-MM-SS-SSS
        Assertions.assertThat(theDay)
                .hasYear(2014)
                .hasMonthValue(9)
                .hasMonth(Month.SEPTEMBER)
                .hasDayOfMonth(18)
                .isBetween("2014-01-01T00:00:00.000", "2014-12-31T23:59:59.000")
                .isBefore(LocalDateTime.now());
    }

    /* 4. 예외 테스트하기*/
    @Test
    @DisplayName("예외 테스트하기")
    void testExceptionValidation() {

        /* 설명. 예제를 위해 Throwable 타입을 원하는 시점에 만들어 볼 수도 있긴하다. */
//        Throwable thrown = AssertionsForClassTypes.catchThrowable(() -> {
//            throw new IllegalArgumentException("잘못된 파라미터를 입력하셨습니다");
//        });

        int firstNum = 10;
        int secondNum = 0;
        NumberValidator numberValidator = new NumberValidator();
        Exception exception = org.junit.jupiter.api.Assertions.assertThrows(
                Exception.class,
                () -> numberValidator.checkDividableNumbers(firstNum, secondNum)
        );


//        Assertions.assertThat(thrown)
        Assertions.assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class)
//                .hasMessageContaining("파라미터");
                .hasMessageContaining("0으로");
    }

    /* 5. filter를 이용한 단정문 테스트하기*/ // 필터->컬렉션 순회
    @Test
    @DisplayName("filtering assertions 테스트하기")
    void testFilteringAssertions(){
        Member member1 = new Member(1,"user01","홍길동",20);
        Member member2 = new Member(2,"user02","유관순",16);
        Member member3 = new Member(3,"user03","이순신",26);
        Member member4 = new Member(4,"user04","신사임당",19);
        Member member5 = new Member(5,"user05","임꺽정",25);

        List<Member> members = Arrays.asList(member1, member2, member3, member4, member5);

        /* 설명. 여러 요소를 순회하여 stream문법처럼 filtering을 걸어서 단정문을 작성 할 수 있다.*/
        Assertions.assertThat(members)
                .filteredOn(member -> member.getAge() > 21)
                .containsOnly(member2, member4);

        Assertions.assertThat(members)
                .filteredOn("age",20)
                .containsOnly(member1);
    }
}
