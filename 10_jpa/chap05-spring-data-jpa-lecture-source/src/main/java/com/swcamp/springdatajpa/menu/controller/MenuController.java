package com.swcamp.springdatajpa.menu.controller;

import com.swcamp.springdatajpa.menu.dto.MenuDTO;
import com.swcamp.springdatajpa.menu.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/menu")
@Slf4j // Loggerfactory    => log.info(~~) lombok깔아야만 쓸 수 있음
public class MenuController {
    //순서 : controller -> service 계층 만드는방식
    private final MenuService menuService;

    /* Logger를 활용한 로그 생성
    * Logger 사용하면? 장점
    * 1. println보다 성능적으로 우수(리소스도 적게먹고 좋음)
    * 2. 외부 리소스 파일로 따로 저장 및 송출이 가능
    * 3. println과 달리 로그레벨에 따른 확인이 가능하다
    * (개발:debug, 서비스:info => 목적을 구분해서 로그레벨 확인 가능)
    * */
    //lombok 사용 안할 시 정석코드
//    Logger logger = LoggerFactory.getLogger(MenuController.class);
//    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    /* url 경로 상에 넘어온 값을 변수에 바로 담을 수 있다(Path Variable*/
    @GetMapping("/{menuCode}")
    public String findMenuByCode(@PathVariable int menuCode, Model model) {
        //화면에 뿌릴 재료들은 Model으로
        System.out.println("menuCode = " + menuCode);
//        logger.info("menuCode = {}", menuCode); 인포레벨
        log.info("menuCode={}", menuCode);
        //loggerFactory안해도 @slf4j 쓰고나면(lombok써야함) log.info~~가능
        log.debug("menuCode={}", menuCode);

        //결과적으로는 DTO로 돌아와야함
        MenuDTO menu = menuService.findMenuByCode(menuCode);

        model.addAttribute("menu", menu);


        return "menu/detail";
    }

    /* 설명. 페이징 처리 전*/
    @GetMapping("/list")
    public String findMenuList(Model model){
        List<MenuDTO> menuList = menuService.findMenuList();

        model.addAttribute("menuList",menuList);

        return "menu/list";
    }

}
