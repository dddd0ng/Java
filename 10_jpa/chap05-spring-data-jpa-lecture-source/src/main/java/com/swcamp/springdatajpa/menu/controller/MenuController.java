package com.swcamp.springdatajpa.menu.controller;

import com.swcamp.springdatajpa.common.Pagination;
import com.swcamp.springdatajpa.common.PagingButtonInfo;
import com.swcamp.springdatajpa.menu.dto.MenuDTO;
import com.swcamp.springdatajpa.menu.entity.Menu;
import com.swcamp.springdatajpa.menu.repository.MenuRepository;
import com.swcamp.springdatajpa.menu.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/menu")
@Slf4j // Loggerfactory    => log.info(~~) lombok깔아야만 쓸 수 있음
public class MenuController {
    //순서 : controller -> service 계층 만드는방식
    private final MenuService menuService;
    private final MenuRepository menuRepository;

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
    public MenuController(MenuService menuService, MenuRepository menuRepository) {
        this.menuService = menuService;
        this.menuRepository = menuRepository;
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
//    @GetMapping("/list")
//    public String findMenuList(Model model){
//        List<MenuDTO> menuList = menuService.findMenuList();
//
//        model.addAttribute("menuList",menuList);
//
//        return "menu/list";
//    }

    /* @PageableDefault
    1. 기본 한 페이지에 10개의 데이터(size,value)
    2. 기본 1페이지부터 (0부터)
    3. 기본 오름차순 (ASC)

    쿼리스트링 쓰는 이유
    1. 서버로 현재 페이지 정보 전달
    2. 서버로 정렬 기준 전달
    3. 서버로 검색어 전달
    */





    /* 설명. 페이징 처리 후*/
    @GetMapping("/list")
    public String findMenuList(@PageableDefault Pageable pageable, Model model) {
        log.debug("pageable = {}", pageable);

        Page<MenuDTO> menuList = menuService.findMenuList(pageable);


        log.debug("조회한 내용 목록 : {}", menuList.getContent());
        log.debug("총 페이지 수 : {}", menuList.getTotalPages());
        log.debug("총 메뉴 수 : {}",menuList.getTotalElements());
        log.debug("해당 페이지에 표시 될 요소 수 : {}",menuList.getSize());
        log.debug("해당 페이지에 실제 요소 수 : {} ",menuList.getNumberOfElements());
        log.debug("Page의 number가 처음이면 (첫 페이지면) : {}", menuList.isFirst());
        log.debug("Page의 number가 마지막이면 (마지막 페이지면) : {}",menuList.isLast());
        log.debug("현재 페이지 : {}",menuList.getNumber());
        log.debug("정렬 기준 : {}",menuList.getSort());

        /* 설명. Page객체를 통해 PagingButtonInfo
        (front가 페이징 처리 버튼을 그리기 위한 재료를 지닌) 추출*/
        PagingButtonInfo paging = Pagination.getPagingButtonInfo(menuList);
        model.addAttribute("menuList",menuList);
        model.addAttribute("paging", paging);



        model.addAttribute("menuList", menuList);

        return "menu/list";
    }

    @GetMapping("/regist")
    public void registMenu() {}

    @GetMapping("/category")
    @ResponseBody   // 핸들러 메소드의 반환형이 View Resolver를 무시해야 할 때(feat. json 문자열로 변환)
    public List<CategoryDTO> findCategoryList() {
        return menuService.findAllCategory();
    }

    @PostMapping("/regist")
    public String registMenu(MenuDTO newMenu) {
        menuService.registMenu(newMenu);

        return "redirect:/menu/list";
    }

}
