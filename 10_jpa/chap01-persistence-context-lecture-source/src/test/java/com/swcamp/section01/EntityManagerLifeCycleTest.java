package com.swcamp.section01;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

public class EntityManagerLifeCycleTest {
    //singleton 느낌 좀 주려고
    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }
    @BeforeEach
    public void initManager(){

        /* 설명. entityManager가 생성 될 때마다 고유의 새로운
        * 영속성 컨텍스트(entity객체를 관리하는 창고)가 생성된다.*/

        entityManager = entityManagerFactory.createEntityManager();

    }
    //method 반납해줘야함
@AfterEach
public void closeManager(){
        entityManager.close();
}

@AfterAll
    public static void closeFactory(){
        entityManagerFactory.close();
    }

    @Test
    public void 엔터티_매니저_팩토리와_엔터티_매니저_생명주기_확인1(){
        System.out.println("entityManagerFactory.hashCode1 : "+entityManagerFactory.hashCode());
        System.out.println("entityManager.hashCode1 : "+entityManager.hashCode());
    }

    @Test
    public void 엔터티_매니저_팩토리와_엔터티_매니저_생명주기_확인2(){
        System.out.println("entityManagerFactory.hashCode2 : "+entityManagerFactory.hashCode());
        System.out.println("entityManager.hashCode2 : "+entityManager.hashCode());
    }
}

//영속성 컨텍스트 -> 엔터티매니저를 만드는순간(영속성 매니저가 관리하는 영속성 컨텍스트도 같이 만들어짐)