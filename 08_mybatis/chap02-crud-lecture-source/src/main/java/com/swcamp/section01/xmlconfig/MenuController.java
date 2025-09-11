package com.swcamp.section01.xmlconfig;

import java.util.List;

public class MenuController {
    private final MenuService menuService;

    public MenuController(){
        this.menuService = new MenuService();
    }



    public void findAllMenus() {
        List<MenuDTO> menuList = menuService.findAllMenus();
        //DTO는 무조건 db테이블이랑 같게는 안만듦
        //why? 화면에 뿌릴 재료가 담겨 있겠지 라는 측면 그래서
        //테이블이랑 똑같이만 만들어야지는X
        //계층별로 데이터를 옮기는 용도.
        //DTO -> 계층을 오가며 데이터를 옮기는 짐꾼 느낌
    }
}
