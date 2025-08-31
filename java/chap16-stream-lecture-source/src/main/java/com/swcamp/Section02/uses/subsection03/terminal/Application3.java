package com.swcamp.Section02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/* 설명.
 *  collect()란?
 *  - 스트림의 요소들을 컬렉션이나 다른 형태로 변환하는 최종연산
 *  - Collectors 클래스의 정적 메소드들을 활용
 *
 * 설명.
 *  주요 Collector들
 *  - toList(), toSet(), toMap(): 컬렉션 변환
 *  - joining(): 문자열 연결
 *  - groupingBy(): 그룹화
 *  - partinioningBy(): 분할
 *  - summarizing(): 통계 수집
 * */
public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. collect() 최종 연산자를 활용할 수 있다. */
        List<Member> memberList = Arrays.asList(
                new Member("u01", "강감찬", 25, "개발팀"),
                new Member("u02", "이순산", 28, "디자인팀"),
                new Member("u03", "유관순", 32, "개발팀"),
                new Member("u04", "장보고", 26, "마케팅팀"),
                new Member("u05", "신사임당", 29, "개발팀")
        );

        /* 설명. 이름을 List로 수집 */
        List<String> nameList = memberList.stream()
//                                        .map(m -> m.getName())
                .map(Member::getName)
                .collect(Collectors.toList());
        System.out.println("nameList = " + nameList);

        /* 설명. 부서의 종류를 Set으로 수집 */
        Set<String> deptSet = memberList.stream()
                .map(Member::getDepartment)
                .collect(Collectors.toSet());
        System.out.println("deptSet = " + deptSet);

        /* 설명. 회원번호를 하나의 문자열로 각 회원을 구분자로 이어 붙여서 표현 */
        String join = memberList.stream()
                .map(Member::getId)
                .collect(Collectors.joining(", " , "{", "}"));
        System.out.println("join = " + join);
    }
}