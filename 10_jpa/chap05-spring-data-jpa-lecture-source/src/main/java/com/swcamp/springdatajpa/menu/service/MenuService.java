package com.swcamp.springdatajpa.menu.service;

import com.swcamp.springdatajpa.menu.dto.MenuDTO;
import com.swcamp.springdatajpa.menu.repository.MenuRepository;
import org.springframework.stereotype.Service;

@Service
//(controller의 )의존성 주입 받아야함
//    @Autowired
//    public MenuController(MenuService menuService) {
//        this.menuService = menuService;
public class MenuService {
    private final MenuRepository menuRepository;

    public MenuDTO findMenuByCode(int menuCode) {
        return null;
    }
}
