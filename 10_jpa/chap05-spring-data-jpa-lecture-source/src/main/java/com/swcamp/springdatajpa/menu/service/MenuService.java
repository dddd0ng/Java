package com.swcamp.springdatajpa.menu.service;

import com.swcamp.springdatajpa.menu.dto.MenuDTO;
import com.swcamp.springdatajpa.menu.entity.Menu;
import com.swcamp.springdatajpa.menu.repository.MenuRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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


    //1. findById(), Optional이 반환되는 점을 고려(get(), orElseXXX())
    public MenuDTO findMenuByCode(int menuCode) {
        Menu menu = menuRepository.findById(menuCode)
                .orElseThrow(IllegalArgumentException::new);

        log.debug("service계층에서 하나의 메뉴 상세보기 : {} ", menu);

        return modelMapper.map(menu, MenuDTO.class);
    }



    // 2. findAll() (페이징 처리 전)
    public List<MenuDTO> findMenuList() {
        //DTO가 오는게 아니라 menu entity가 돌아옴

        //내가 원하는 속성에 대한 정렬 가능(sort.by())
        List<Menu> menus = menuRepository.findAll(Sort.by("menuCode").descending());
        log.debug("service계층에서 모든 메뉴보기 : {}", menus);

        return menus.stream()
                .map(menu->modelMapper.map(menu,MenuDTO.class))
                .collect(Collectors.toList());
    }
}
