package com.swcamp.handlermethod;
//bean이 되기도 해야함, 스프링이 컨트롤러 계층인지 인지해야하므로

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

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
//위에는 서블릿버전?이라하심
        return"first/messagePrinter";
    }

    @GetMapping("/modify")
    public void modify(){}


    /* 설명.
    * request의 parameter로 넘어오는 값들의 key값과 일치하는
    * 변수명(어노테이션 생략 가능)을 작성하고 @RequestParam어노테이션을
    * 적용하면 알아서 값을 꺼내고 해당 매개변수의 자료형에 맞게 자료형 변환까지 해준다.
    * (물론 가능한 경우)
    *
    * 1.defaultValue : 사용자의 입력 값이 없거나("") 아니면 request의 parameter 키 값과 일치하지 않는
    *                   매개변수 사용 시, 매개변수가 가질 기본 default값을 작성한다.
    *
    * 2.name : request parameter의 키 값과 다른 매개변수 명을 사용하고 싶을 때
    *          request parameter의 키 값을 작성한다.
    *
    * */


    @PostMapping("modify1")
    //spring장점 @RequestParam 자료형 String으로 꺼내질거같아도 Int로도 반환이 가능(자동으로 파싱됨)

    public String modifyMenu1(Model model,
//         //원래는 넘어오는 값도 다 적어야함(원칙이라함) @RequestParam String modifyName,
                              @RequestParam(name="modifyName", defaultValue="디폴트") String modifyName,
//                              @RequestParam int modifyPrice)
// @RequestParam생략해도 가능
//                              @RequestParam(name="modifyPrice", defaultValue="0") int modifyPrice){
                             int modifyPrice){
    //넘어온 parameter의 키 값과 일치하며 해당 타입으로 변환 가능하면 @RequestParam 생략 가능


        /* 설명. 넘어온 데이터를 바탕으로 update를 성공했다는 가정*/

        String message = modifyName+"메뉴의 가격을"+modifyPrice+"로 변경하였습니다.";
        model.addAttribute("message",message);

        return "first/messagePrinter";
    }

    /* 설명. @*/
    @PostMapping("modify2")
    public String modify2(Model model,
    @RequestParam Map<String, String> parameterMap){
        String modifyName = parameterMap.get("modifyName");
        int modifyPrice = Integer.parseInt(parameterMap.get("modifyPrice"));

        String message = modifyName+"메뉴의 가격을"+modifyPrice+"로 변경하였습니다.";
        model.addAttribute("message",message);

        return "first/messagePrinter";
    }

}
