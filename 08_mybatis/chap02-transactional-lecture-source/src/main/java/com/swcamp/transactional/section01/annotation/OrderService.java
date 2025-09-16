package com.swcamp.transactional.section01.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {

    private final OrderMapper orderMapper;
    private final MenuMapper menuMapper;

    @Autowired
    public OrderService(OrderMapper orderMapper, MenuMapper menuMapper) {
        this.orderMapper = orderMapper;
        this.menuMapper = menuMapper;
    }

    @Transactional
    public void registNewOrder(OrderDTO orderInfo) {

        /* 설명. 1. 주문한 메뉴들의 코드만 추출(DTO에서) */
        List<Integer> menuCodes = new ArrayList<>();
        List<OrderMenuDTO> orderMenus = orderInfo.getOrderMenus();
        for (OrderMenuDTO orderMenu: orderMenus) {
            menuCodes.add(orderMenu.getMenuCode());
        }

        Map<String, List<Integer>> map = new HashMap<>();
        map.put("menuCodes", menuCodes);

        /* 설명. 2. 주문한 메뉴별로 Menu엔티티에 담아서 조회(select)해 오기(부가적인 메뉴의 정보 추출(단가)) */
        List<Menu> menus = menuMapper.selectMenuByMenuCodes(map);
        menus.forEach(System.out::println);

        /* 설명. 3. 이 주문건에 대한 총 합계를 계산 */

        /* 설명. 4. 1부터 3까지 해서 tbl_order 테이블에 추가(insert) */

        /* 설명. 5. tbl_order_menu 테이블에도 주문한 메뉴 갯수만큼 메뉴를 추가(insert) */


    }
}
