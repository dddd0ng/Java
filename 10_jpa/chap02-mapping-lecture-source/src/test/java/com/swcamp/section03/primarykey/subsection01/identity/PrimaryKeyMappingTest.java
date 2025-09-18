package com.swcamp.section03.primarykey.subsection01.identity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

import java.util.jar.JarEntry;

public class PrimaryKeyMappingTest {
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
    public void 식별자_매핑_테스트(){
        Member member = new Member();
//        member.setMemberNo(1);
        member.setMemberId("user02");
        member.setMemberPwd("pass02");
        member.setNickname("유관순");
        member.setEmail("yu@gmail.com");
        member.setAddress("서울시 강남");
        member.setEnrollDate(new java.util.Date());
        member.setMemberRole("ROLE_ADMIN");
        member.setStatus("Y");
        
        
        
        Member member2 = new Member();
//        member.setMemberNo(1);
        member2.setMemberId("user02");
        member2.setMemberPwd("pass02");
        member2.setNickname("유관순");
        member2.setEmail("yu@gmail.com");
        member2.setAddress("서울시 강남");
        member2.setEnrollDate(new java.util.Date());
        member2.setMemberRole("ROLE_ADMIN");
        member2.setStatus("Y");
        
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        System.out.println("persist 전 member : " + member);
        entityManager.persist(member);
        entityManager.persist(member2);

        System.out.println("persist 후(flush 된 후) member: " + member);


        /* 설명. persist 당시에는 부여되지 않은 pk값으로 commit이후 조회를 하면 가능할까?*/
        Member selectedMember = entityManager.find(Member.class, 1);
        System.out.println("selectedMember = " + selectedMember);

        transaction.commit();

        /* 설명. insert 전에 영속 상태의 엔터티 객체에는 pk값이 없었지만,
        * persist 이후 pk find 시에는 존재*/

        /* 설명. persist 시점에 insert가 날아감*/
        
    }
    
}
