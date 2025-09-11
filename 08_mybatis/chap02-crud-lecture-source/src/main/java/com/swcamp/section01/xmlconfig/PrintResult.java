package com.swcamp.section01.xmlconfig;

import java.util.List;

public class PrintResult {
    public void printMenus(List<MenuDTO> menuList) {//메뉴 리스트 보기
        menuList.forEach(System.out::println);
    }

    /* 설명. Exception Handling을 통한 페이지와 같은 느낌의 메소드.*/
    public void printErrorMessage(String message) {
        System.out.println("에러 메시지 : " + message);
    }

    public void printMenu(MenuDTO menu) { //메뉴 단일로 보기
        System.out.println("menu = " + menu);
    }
}
