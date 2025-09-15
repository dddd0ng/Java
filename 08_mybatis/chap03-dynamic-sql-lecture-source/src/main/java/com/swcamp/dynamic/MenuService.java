package com.swcamp.dynamic;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.swcamp.dynamic.Template.getSqlSession;

public class MenuService {
    public void findMenuByPrice(int maxPrice) {
        SqlSession sqlSession = getSqlSession();
//        System.out.println("sqlSession = " + sqlSession);

        MenuMapper mapper =
                sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.selectMenuByPrice(maxPrice);
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchMenu(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();

        MenuMapper mapper =
                sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenu(searchCriteria);
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchMenuBySupCategory(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper =
                sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuBySupCategory(searchCriteria);
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchMenuByRandomMenuCode(List<Integer> integers) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper =
                sqlSession.getMapper(MenuMapper.class);

        /* 설명. List형태로 기본적으로는 넘기지 않지만 foreach를 활용하는 동적쿼리는 list 활용 가능(feat. key값 불필요) */
        List<MenuDTO> menus = mapper.searchMenuByRandomMenuCode(integers);
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchMenuByCodeOrSearchAll(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper =
                sqlSession.getMapper(MenuMapper.class);

        /* 설명. List형태로 기본적으로는 넘기지 않지만 foreach를 활용하는 동적쿼리는 list 활용 가능(feat. key값 불필요) */
        List<MenuDTO> menus = mapper.searchMenuByCodeOrSearchAll(searchCriteria);
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchMenuByNameOrCategory(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper =
                sqlSession.getMapper(MenuMapper.class);

        /* 설명. List형태로 기본적으로는 넘기지 않지만 foreach를 활용하는 동적쿼리는 list 활용 가능(feat. key값 불필요) */
        List<MenuDTO> menus = mapper.searchMenuByNameOrCategory(criteria);
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void modifyMenu(Map<String, Object> critMap) {
        SqlSession sqlSession = getSqlSession();
        //마이바티스에서 db랑 상호작용하기위해 sql세션객체 가져옴(이 세션 있어야 sql실행 가능)
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);
        //매퍼객체 가져오기(menuMapper인터페이스 구현체를 mybatis가 자동으로 만들어줌)
        //mapper.updateMenu(critMap)호출하면 매퍼xml에 정의된 sql(update)문이 실행됨

        int result = mapper.updateMenu(critMap);
        //실행 -> db에 update sql문 실행

        //결과처리(트랜잭션 제어)
        if(result == 1){ //커밋해서 db에 반영
            System.out.println("메뉴 정보 변경에 성공하였습니다.");
            sqlSession.commit();
        }else{ //롤백해서 변경사항 취소
            System.out.println("메뉴 정보 변경에 실패하였습니다.");
            sqlSession.rollback();
        }//메시지 출력으로 로그도 남기깅

        sqlSession.close(); //세션 종료(사용끝났으니까 세션닫기, db연결 반환)
    }
}
