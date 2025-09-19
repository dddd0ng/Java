package com.swcamp.springdatajpa.menu.service;

import com.swcamp.springdatajpa.menu.dto.MenuDTO;
import com.swcamp.springdatajpa.menu.entity.Menu;
import com.swcamp.springdatajpa.menu.repository.MenuRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
//(controller의 )의존성 주입 받아야함
//    @Autowired
//    public MenuController(MenuService menuService) {
//        this.menuService = menuService;
public class MenuService {
    private final MenuRepository menuRepository;
//service 계층
    private final ModelMapper modelMapper;

    @Autowired
    public MenuService(MenuRepository menuRepository
                       , ModelMapper modelMapper) {
        this.menuRepository = menuRepository;
        this.modelMapper = modelMapper;
    }

    public MenuDTO findMenuByCode(int menuCode) {
        Menu menu = menuRepository.findById(menuCode)
                .orElseThrow(IllegalArgumentException::new);

        log.debug("service계층에서 하나의 메뉴 상세보기 : {} ", menu);

        return modelMapper.map(menu, MenuDTO.class);
    }
}
