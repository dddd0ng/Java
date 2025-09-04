package com.swcamp.section03.annotationconfig.subsection01.java;

import com.swcamp.common.MemberDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

//설정파일이자 스스로 콩(bean)이 됨
//순수 어노테이션 자바,xml방식 두개(다양성을 느끼기위해)
//자바에서 어노테이션 쓰는방법은? DAO
@Configuration("config") //
//@ComponentScan(basePackages = "com.swcamp")//하위 패키지에 있는 파일들 스캔 (@Component 붙은거)
/* 설명. 1. 기본적으로는 설정파일이 있는 패키지 및 하위만 Scan하지만
 *  basePackage를 바꾸면 다른 범위도 가능하다.*/
//@ComponentScan(basePackages = {"com.swcamp.common", "com.swcamp.section01"}) <= 이런식으로도 사용 가능

/* 설명. 2. 범위 및 필터를 적용해서 제외하고자 하는 bean을
 *  등록하는 경우(excludeFilters)*/
//@ComponentScan(basePackages = "com.swcamp",
//excludeFilters = { // 2-1 타입으로 설정
//        @ComponentScan.Filter( // 이렇게까지 커스터마이징이 가능하다
////                type= FilterType.ASSIGNABLE_TYPE,
////                classes = {MemberDAO.class}
//                //bean이 되는건 아니지만 repository의 기능만 쓰는것도 가능
//
//                // 2-2 어노테이션 종류로 설정
//                type = FilterType.ANNOTATION,
//                classes = {org.springframework.stereotype.Repository.class}
//        )
//})

/* 설명. 3. 범위 및 필터를 적용해서 포함(등록)하고자 하는
 *  bean을 등록하는 경우(includeFilters)*/
@ComponentScan(basePackages = "com.swcamp",//{"com.swcamp", "com"},
        useDefaultFilters = false,          //현재 범위의 bean들은 일단 모두 Off
        includeFilters = {
        @ComponentScan.Filter(
                type=FilterType.ASSIGNABLE_TYPE,
                classes = {MemberDAO.class} // MemberDAO 타입만 등록
        )
})

public class ContextConfiguration {

}
//어노테이션 설정파일보고 이미 기본생성자 호출
//주도권을 스프링이 갖고있당



