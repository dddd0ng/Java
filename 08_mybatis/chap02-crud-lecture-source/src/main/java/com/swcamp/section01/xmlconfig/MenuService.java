package com.swcamp.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.swcamp.section01.xmlconfig.Template.getSqlSession;

public class MenuService {
    private final MenuDAO menuDAO;

    public MenuService() {
        menuDAO = new MenuDAO();
    }

    public List<MenuDTO> findAllMenus() {
        SqlSession sqlSession= getSqlSession();
        List<MenuDTO> menuList = menuDAO.selectAllMenus(sqlSession);
        sqlSession.close();
        return menuList;
    }
}

// 서비스에서 하는거 커넥션객체 생성,소멸