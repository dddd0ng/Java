package com.swcamp.dynamic;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

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

        /* 설명. List형태로 기본적으로는 넘기지 않지만 foreach를 활용하는 동적쿼리는 list 활용 가능*/
        List<MenuDTO> menus = mapper.searchMenuByRandomMenuCode(integers);
        menus.forEach(System.out::println);

        sqlSession.close();
    }
}
