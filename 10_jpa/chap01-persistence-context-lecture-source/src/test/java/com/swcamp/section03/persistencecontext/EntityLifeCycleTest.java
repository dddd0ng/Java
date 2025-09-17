package com.swcamp.section03.persistencecontext;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

public class EntityLifeCycleTest {
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
    public void 비영속성_테스트(){
        Menu foundMenu = entityManager.find(Menu.class, 11);
/* 설명. 비영속 상태의 newMenu*/
        Menu newMenu = new Menu();
        newMenu.setMenuCode(foundMenu.getMenuCode());
        newMenu.setMenuName(foundMenu.getMenuName());
        newMenu.setMenuPrice(foundMenu.getMenuPrice());
        newMenu.setCategoryCode(foundMenu.getCategoryCode());
        newMenu.setOrderableStatus(foundMenu.getOrderableStatus());

        Assertions.assertFalse(foundMenu==newMenu);
    //동등하지만 동일하지는 않다.
    }

    @Test
    public void 영속성_테스트(){
        Menu foundMenu1 = entityManager.find(Menu.class, 11);
        Menu foundMenu2 = entityManager.find(Menu.class, 11);

        Assertions.assertTrue(foundMenu1==foundMenu2);
    }

    @Test
    public void 영속성_객체_추가_테스트() {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Menu menuToRegist = new Menu();
        menuToRegist.setMenuCode(500);
        menuToRegist.setMenuName("수박죽");
        menuToRegist.setMenuPrice(100000);
        menuToRegist.setCategoryCode(10);
        menuToRegist.setOrderableStatus("Y");

        entityManager.persist(menuToRegist);
        //insert해줘 x -> 맡아줘 o
        Menu foundMenu = entityManager.find(Menu.class,500);

        transaction.commit();
//커밋 시점에는 flush가 발생함

        Assertions.assertTrue(menuToRegist==foundMenu);

    }

    @Test
    public void 영속성_객체_추가_및_변경_테스트(){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Menu menuToRegist = new Menu();
        menuToRegist.setMenuCode(501);
        menuToRegist.setMenuName("수박죽");
        menuToRegist.setMenuPrice(100000);
        menuToRegist.setCategoryCode(10);
        menuToRegist.setOrderableStatus("Y");
        //여기 위에는 비영속상태
        entityManager.persist(menuToRegist); // 여기서부터 영속 상태가 됨
        menuToRegist.setMenuName("메론죽");

        Menu foundMenu = entityManager.find(Menu.class,501);

        transaction.commit();

        Assertions.assertEquals("메론죽", foundMenu.getMenuName());

    }

    @Test
    public void 준영속성_detach_테스트(){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Menu foundMenu1 = entityManager.find(Menu.class, 11);
        Menu foundMenu2 = entityManager.find(Menu.class, 11);
        System.out.println("foundMenu1 = " + foundMenu1);
        System.out.println("foundMenu2 = " + foundMenu2);


        /* 영속성 컨텍스트가 관리하던 엔터티 객체를 잠시 관리하지
        * 않는 상태가 되게 한 것을 준영속 상태라고 함
        * detach, clear, close가 준영속 상태를 만들기 위한 메소드
        *
        * 준영속 사용하는 이유 =>
        * JPA에서 엔터티를 더 이상 영속성 컨텍스트에서 관리하지 않음을 의미,
        * 특정 상황(flush를 특정 시점에 별도로 사용)에서 성능 최적화나
        * 데이터 무결성 유지, 특정 작업 후 엔터티 변경 방지를 위해서 사용됨

        * (DB에서 가져온 객체를 DB에 영향을 크게 주지 않는 선에서
        * 활용하고 싶을 때, 둘 다 활용도 가능)
        * */
        //detach를 하면 하나씩 뜯을 수 있음
        entityManager.detach(foundMenu2);

        foundMenu1.setMenuPrice(7000);
        foundMenu2.setMenuPrice(7000);

        transaction.commit();
    }

    @Test
    public void 준영속성_clear_close_테스트(){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Menu foundMenu1 = entityManager.find(Menu.class, 11);
        Menu foundMenu2 = entityManager.find(Menu.class, 12);

//        entityManager.clear();
        //영속성 컨텍스트에 있는 모든 영속 상태의 엔터티를 준영속으로 연결

        entityManager.close();
        //기존의 영속 상태의 엔터티들이 모두 준영속 상태가 되면서 영속성 컨텍스트가 파괴됨
        entityManager = entityManagerFactory.createEntityManager();
        //새로 만듦

        foundMenu1.setMenuPrice(11000);
        foundMenu2.setMenuPrice(11000);

//8000으로 업데이트만 안되면 준영속상태

        transaction.commit();

        Assertions.assertNotEquals(11000, entityManager.find(Menu.class, 11).getMenuPrice());
        Assertions.assertNotEquals(11000, entityManager.find(Menu.class, 12).getMenuPrice());
        //준영속으로 만들면 영속 컨텍스트 비어있을텐데 다시 불러오는거(db)
    }

    @Test
    public void 병합_merge_수정_테스트(){
        //준영속상태를 다시 영속상태로 만드는것 <= merge
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Menu menuToDetach = entityManager.find(Menu.class, 5);
        entityManager.clear();

        menuToDetach.setMenuName("수박죽");

        Menu refoundMenu = entityManager.find(Menu.class, 5);
        System.out.println("첫 번째 5번 메뉴의 이름 : "+menuToDetach.getMenuName());
        System.out.println("두 번째 5번 메뉴의 이름 : "+refoundMenu.getMenuName());

        entityManager.merge(menuToDetach);

        /* 설명. 결과적으로 준영속 상태였던것과 DB에서 다시 조회한
         것 중에 어떤것이 살아 남았는지 확인하기 위해 다시 find*/
        Menu managedMenu = entityManager.find(Menu.class, 5);

        transaction.commit();

        Assertions.assertEquals("수박죽", managedMenu.getMenuName());
    }
}
