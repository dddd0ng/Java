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
        SqlSession sqlSession = getSqlSession();
        List<MenuDTO> menuList = menuDAO.selectAllMenus(sqlSession);
        sqlSession.close();
        return menuList;
    }

    public MenuDTO findMenuByMenuCode(int menuCode) {
        SqlSession sqlSession = getSqlSession();
        //위 코드는 절대 메서드 밖에 있으면 안됨, 사용자별 별도의 객체
//        MenuDTO menu = menuDAO.selectOneMenu(sqlSession,menuCode);
        MenuDTO menu = menuDAO.selectMenuByMenuCode(sqlSession, menuCode);
        sqlSession.close();
        return menu;

    }

    //커밋과 롤백
    public boolean registMenu(MenuDTO menu) {
    SqlSession sqlSession = getSqlSession();

    int result=menuDAO.insertMenu(sqlSession,menu);

    //트랜잭션 처리
    if(result==1){
        sqlSession.commit();
    }else {
        sqlSession.rollback();
    }

    sqlSession.close();

    return result==1? true:false;
    }
}

// 서비스에서 하는거 커넥션객체 생성,소멸