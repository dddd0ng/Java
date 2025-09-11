package com.swcamp.section01.xmlconfig;

import java.util.List;
import java.util.Map;

public class MenuController {
    private final MenuService menuService;
    private final PrintResult printResult;
    //응답 페이지같은 느낌(출력 응답 페이지, 응답 출력용 페이지 느낌으로 만든 클래스)

    public MenuController() {
        this.menuService = new MenuService();
        this.printResult = new PrintResult();
    }



    public void findAllMenus() {
        List<MenuDTO> menuList = menuService.findAllMenus();
        //DTO는 무조건 db테이블이랑 같게는 안만듦
        //why? 화면에 뿌릴 재료가 담겨 있겠지 라는 측면 그래서
        //테이블이랑 똑같이만 만들어야지는X
        //계층별로 데이터를 옮기는 용도.
        //DTO -> 계층을 오가며 데이터를 옮기는 짐꾼 느낌

        if (!menuList.isEmpty()) {
            //메뉴가 없어도 null이 아님, 비어있지 않으면 조회가 된거(하나의 메뉴라도 조회 성공)
            printResult.printMenus(menuList);
        }else{//하나의 메뉴도 없는 상태면 조회 실패
            printResult.printErrorMessage("전체 메뉴 조회 실패");
        }//이런게 exception handling 같은 느낌임

    }

    public void findMenuByMenuCode(Map<String, String> parameter) {
        int menuCode = Integer.parseInt(parameter.get("menuCode"));
        MenuDTO menu = menuService.findMenuByMenuCode(menuCode);

        if(menu != null) {
            printResult.printMenu(menu);
        } else {
            printResult.printErrorMessage(menuCode + "번의 메뉴는 없습니다!");
        }
    }
//값을 꺼내 파싱
    public void registMenu(Map<String, String> parameter) {
        String menuName = parameter.get("menuName");
        int menuPrice = Integer.parseInt(parameter.get("menuPrice"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTO menu = new MenuDTO();
        menu.setMenuName(menuName);
        menu.setMenuPrice(menuPrice);
        menu.setCategoryCode(categoryCode);

        /* 설명. DML 작업 이후 Controller로는 boolean형이 돌아오게 작성할 예정*/
        if(menuService.registMenu(menu)){

            printResult.printSuccessMessage("regist");
        }else{
            printResult.printErrorMessage("메뉴 추가 실패");

        }
    }
}
