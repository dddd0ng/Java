package com.swcamp.xmlmapper;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.swcamp.xmlmapper.Template.getSqlSession;

public class ElementService {

    public void selectResultMapTest() {
        SqlSession sqlSession = getSqlSession();
        ElementMapper mapper = sqlSession.getMapper(ElementMapper.class);

        List<MenuDTO> menus = mapper.selectResultMapTest();
        menus.forEach(System.out::println);

        sqlSession.close();

    }
}
