package com.swcamp.section02.column;

import com.swcamp.section03.primarykey.subsection01.identity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

public class ColumnMappingTest {
    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    } //전체 테스트 시작 전에 팩토리 생성 , xml파일 <persistence-unit name="jpatest">이거랑 name 맞춰야함

    @BeforeEach
    public void initManager() {
        entityManager = entityManagerFactory.createEntityManager();
    } // 테스트 실행할 때마다 새로운 EntityManager(새로운 영속성 컨텍스트) 생성

    //method 반납해줘야함
    @AfterEach
    public void closeManager() {
        entityManager.close();
    }
    // 테스트 끝나면 자원 반납
    @AfterAll
    public static void closeFactory() {
        entityManagerFactory.close();
    }
// 전체 테스트 종료 후 팩토리 닫음

    @Test
    public void 컬럼에서_사용하는_속성_테스트(){
        Member member = new Member();
        member.setMemberNo(1);
        member.setMemberId("user02");
        member.setMemberPwd("pass02");
        member.setNickname("유관순");
        member.setEmail("yu@gmail.com");
        member.setAddress("서울시 강남");
        member.setEnrollDate(new java.util.Date());
        member.setMemberRole("ROLE_ADMIN");
        member.setStatus("Y");

        //when
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(member);

        //then
        com.swcamp.section01.entity.Member foundMember = entityManager.find(com.swcamp.section01.entity.Member.class, 1);
        foundMember.setNickname("동해번쩍");


        transaction.commit();

    }

}
