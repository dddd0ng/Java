package com.swcamp.handlermethod;
//bean이 되기도 해야함, 스프링이 컨트롤러 계층인지 인지해야하므로

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//컨트롤러가 되면 requestMapping, getMapping을 할 수 있음(컨트롤러때매 할 수 있는것)
@RequestMapping("/first") // 접두사를 이렇게 빼버릴수있음
@Controller
public class FirstController {
//접두사, 접미사는 다음 챕터때
    //이런거보고 핸들러 메서드라고 함
//    @GetMapping("/first/regist")<= @RequestMapping("/first") 사용하고서 /first안써도됨
    @GetMapping("/regist")
    // 핸들러 메소드에서 반환형이 없을 경우 요청 경로를 반환한다.(요청 경로가 곧 view)
//    public String regist(){ //반환한건 view의 이름이 됨 -> 리졸브때문에
//        return "/first/regist"; //templates에 해당 적힌대로 /first(폴더)/(최하위)regist.html(html은 제외해서 적음)
//    }
    public void regist(){}

    @PostMapping("regist")
    public String registMenu(HttpServletRequest request, Model model){
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int categoryCode = Integer.parseInt(request.getParameter("categoryCode"));

        /* 설명. Service계층의 메소드를 호출하며 비즈니스 로직(insert 트랜잭션)을 성공하고 돌아왔다는 가정*/
        
        /* 설명. insert 성공 메시지와 함께 성공 페이지로 이동*/
        String message = name+"을(를) 신규 메뉴 목록의" + categoryCode+"번 카테고리에"
                +price+"원으로 등록에 성공하였습니다!";
        model.addAttribute("message",message);

        return"first/messagePrinter";

    }

}
