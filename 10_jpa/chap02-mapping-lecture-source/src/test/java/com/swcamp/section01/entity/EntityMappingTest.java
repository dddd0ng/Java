package com.swcamp.section01.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

public class EntityMappingTest {
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
    public void 테이블_만들기_테스트(){

        //given
        Member member = new Member();
        member.setMemberNo(1);
        member.setMemberId("user01");
        member.setMemberPwd("pass01");
        member.setNickname("홍길동");
        member.setPhone("010-1234-5678");
        member.setEmail("hong@gmail.com");

        //when
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(member);

        //then
        Member foundMember = entityManager.find(Member.class, 1);
        foundMember.setNickname("동해번쩍");


        transaction.commit();

    }
}
