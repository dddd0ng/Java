package com.swcamp.springdatajpa.menu.controller;

import com.swcamp.springdatajpa.menu.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {
    //순서 : controller -> service 계층 만드는방식
    private final MenuService menuService;

    /* Logger를 활용한 로그 생성*/
    Logger logger = LoggerFactory.getLogger(MenuController.class);


    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    /* url 경로 상에 넘어온 값을 변수에 바로 담을 수 있다(Path Variable*/
    @GetMapping("/{menuCode}")
    public String findMenuByCode(@PathVariable int menuCode, Model model) {
        //화면에 뿌릴 재료들은 Model으로
        System.out.println("menuCode = " + menuCode);
        logger.info("menuCode = {}", menuCode);


        return null;
    }

}
