package com.swcamp.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuDAO {
    public List<MenuDTO> selectAllMenus(SqlSession sqlSession) {

//        return sqlSession.selectList("com.swcamp.section01.xmlconfig.MenuDAO.selectAllMenus");
        return sqlSession.selectList("MenuMapper.xmlconfig.MenuDAO.selectAllMenus");
    }
}
