package com.swcamp.springdatajpa.menu.service;

import com.swcamp.springdatajpa.menu.dto.CategoryDTO;
import com.swcamp.springdatajpa.menu.dto.MenuDTO;
import com.swcamp.springdatajpa.menu.entity.Category;
import com.swcamp.springdatajpa.menu.entity.Menu;
import com.swcamp.springdatajpa.menu.repository.CategoryRepository;
import com.swcamp.springdatajpa.menu.repository.MenuRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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


    private final CategoryRepository categoryRepository;


    @Autowired
    public MenuService(MenuRepository menuRepository
                       , ModelMapper modelMapper
                    ,CategoryRepository categoryRepository) {
        this.menuRepository = menuRepository;
        this.modelMapper = modelMapper;
        this.categoryRepository = categoryRepository;
    }


    //1. findById(), Optional이 반환되는 점을 고려(get(), orElseXXX())
    public MenuDTO findMenuByCode(int menuCode) {
        Menu menu = menuRepository.findById(menuCode)
                .orElseThrow(IllegalArgumentException::new);

        log.debug("service계층에서 하나의 메뉴 상세보기 : {} ", menu);

//        return modelMapper.map(menu, MenuDTO.class);
        return menuToMenuDTO(menu);
    }

    /* 설명. ModelMapper 안쓰고 수동으로 매핑하는 법 */
    MenuDTO menuToMenuDTO(Menu menu) {
        MenuDTO menuDTO = new MenuDTO();
//        menuDTO.setMenuCode(menu.getMenuCode());
        menuDTO.setMenuName(menu.getMenuName());
        menuDTO.setMenuPrice(menu.getMenuPrice());
//        menuDTO.setCategoryCode(menu.getCategoryCode());
//        menuDTO.setOrderableStatus(menu.getOrderableStatus());

        return menuDTO;
    }

    /* 설명. Controller와 Service 계층 사이는 DTO가 아닌 Map으로 처리도 가능하다.(feat. 다운캐스팅 조심) */
    Map<String, Object> menuTOMenuMap(Menu menu) {
        Map<String, Object> menuMap = new HashMap();
        menuMap.put("menuCode", menu.getMenuCode());
        menuMap.put("menuName", menu.getMenuName());
        menuMap.put("menuPrice", menu.getMenuPrice());
        menuMap.put("categoryCode", menu.getCategoryCode());
        menuMap.put("orderableStatus", menu.getOrderableStatus());

        return menuMap;
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

    // 3. findAll() (페이징 처리 후)
    public Page<MenuDTO> findMenuList(Pageable pageable) {

        /* 넘어온 pageable 객체를 커스터마이징
        * 1. page 값이 넘어오면 인덱스 개념으로 바꾼다. (front에서 페이지번호가 그대로 넘어왔다는 가정)
        * 2. 한 페이지에 뿌릴 사이즈는 유지
        * 3. 정렬 기준을 내림차순으로 변경
        * */

        pageable = PageRequest.of(pageable.getPageNumber()<=0 ? 0: pageable.getPageNumber() -1,
                pageable.getPageSize(),
                Sort.by("menuCode").descending());


        Page<Menu> menuList = menuRepository.findAll(pageable);

        /* Page는 자체로 stream이다.*/
        return menuList.map(
                menu -> modelMapper.map(menu, MenuDTO.class));
    }



//      4. jpql및 native query 활용
    public List<CategoryDTO> findAllCategory() {

        List<Category> categories = categoryRepository.findAllCategories();

        return categories.stream()
                .map(category -> modelMapper.map(category, CategoryDTO.class))
                .collect(Collectors.toList());
    }


    //5. insert 진행(entity로 변환)
    @Transactional
    public void registMenu(MenuDTO newMenu) {
        menuRepository.save(modelMapper.map(newMenu, Menu.class));
    }
//트랜잭셔널 - 영속성 컨텍스트가 생성됨, 엔티티매니저가 존재,하나의 엔터티컨테이너가 존재
    /*6. update 진행*/
    @Transactional
    public void modifyMenu(MenuDTO modifyMenu) {

        /* 설명. 수정 할 메뉴를 가져와서(영속 상태로 만들어) 영속 상태인 객체를 수정하면 update*/
        Menu foundMenu = menuRepository.findById(modifyMenu.getMenuCode()).get(); //pk값 반환(menucode)
        foundMenu.setMenuName(modifyMenu.getMenuName());
    }
    /*7. delete 진행 */
    @Transactional
    public void deleteMenu(int menuCode) {
        menuRepository.deleteById(menuCode);
    }


    /*8. 쿼리 메소드 활용하기*/
    public List<MenuDTO> findMenuPrice(int menuPrice) {
//        List<Menu> menus = menuRepository.findByMenuPriceGreaterThan(menuPrice);
        List<Menu> menus = menuRepository.findByMenuPriceBetween(menuPrice, menuPrice +10000);
//By 자체가 Where구문
        return menus.stream()
                .map(menu->modelMapper.map(menu,MenuDTO.class))
                .collect(Collectors.toList());

    }
}
