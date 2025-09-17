package com.swcamp.section02.crud;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

public class EntityManagerCRUDTest {

    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }

    @BeforeEach
    public void initManager() {
        entityManager = entityManagerFactory.createEntityManager();

    }

    //method 반납해줘야함
    @AfterEach
    public void closeManager() {
        entityManager.close();
    }

    @AfterAll
    public static void closeFactory() {
        entityManagerFactory.close();
    }


    @Test
    public void 메뉴코드로_메뉴_조회_테스트() {
        int menuCode = 2;

        /* 설명. entityManager를 통해 여러번 find를 해도 select은 한번만 동작함 (DB I/O 횟수 줄임)*/


//        Menu foundMenu = entityManager.find(Menu.class, 2); ==
        //없으면 select이 일어남
        Menu foundMenu = entityManager.find(Menu.class, menuCode);
        Menu foundMenu2 = entityManager.find(Menu.class, menuCode);
//menuCode <=  PK (@Id) 값을 가져와야 하는자리


        /* 설명. 단정문은 두 개 이상 가능하며 동일성 보장 확인*/
        Assertions.assertNotNull(foundMenu);
        //jpa는 동일성을 보장함
        Assertions.assertEquals(foundMenu, foundMenu2);
        System.out.println("foundMenu = " + foundMenu);
    }

    @Test
    public void 새로운_메뉴_추가_테스트() {
        Menu menu = new Menu();
        menu.setMenuName("꿀발린추어탕");
        menu.setMenuPrice(7000);
        menu.setCategoryCode(4);
        menu.setOrderableStatus("Y");

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        //commit,rollback 전 까지 transaction

        try {
            entityManager.persist(menu); //영속 상태로 바꿈
            //엔터티 매니저한테 맡기고, 맡기기 전에 트랜잭션 해야함
            transaction.commit();
            //커밋 시 내부적으로 flash()
            //인서트문이 날라가서 db에 추가됨, 알아서 db에서 auto_increment
        } catch (Exception e) {
            transaction.rollback();
        }
    }

    @Test
    public void 메뉴_이름_수정_테스트() {
        /* 설명. 23번 메뉴 엔터티를 영속 상태로 만들어 받은 다음(관리해달라고 한 다음)*/
        Menu menu = entityManager.find(Menu.class, 23);
//                수정할 대상을 영속 상태로 가져와야함, entityManager23 아무것도없으니
//                find -> select문이 날라감 반환받으면 해당 메뉴엔티티는 영속 상태
        System.out.println("수정 전 menu : " + menu);

        String menuNameToChange = "갈치스무디";

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        //commit,rollback 전 까지 transaction

        try {
            menu.setMenuName(menuNameToChange);//갈치스무디로 변경 후 커밋
            
            transaction.commit();
            //영속상태의 값을 바꾸는게 업데이트
        } catch (Exception e) {
            transaction.rollback();
        }
    }
}
