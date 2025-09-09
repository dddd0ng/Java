package com.swcamp.handlermethod;
//bean이 되기도 해야함, 스프링이 컨트롤러 계층인지 인지해야하므로

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

//컨트롤러가 되면 requestMapping, getMapping을 할 수 있음(컨트롤러때매 할 수 있는것)
@RequestMapping("/first") // 접두사를 이렇게 빼버릴수있음
@Controller
/* 설명. 이 컨트롤러 클래스의 핻늘러 메소드에서 Model에
"id"또는 "name"이 키 값으로 담기면 HttpSession에 추가하라는 어노테이션*/
/* 설명. HttpSession에서 제공하는 invalidate()가 아닌 SessionStatus에서
제공하는 setComplete()을 통해서만 만료 할 수 있다.*/
@SessionAttributes(names={"id","name"}) //스트링 배열처럼 던져주면 됨
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
//주로 이 방법보다 위에 생략된 방법을 많이 씀
    /* 설명. @RequestParam을 활용해 하나의 Map으로 받아 낼 수 있다.*/
    @PostMapping("modify2")
    public String modify2(Model model,
    @RequestParam Map<String, String> parameterMap){
        String modifyName = parameterMap.get("modifyName");
        int modifyPrice = Integer.parseInt(parameterMap.get("modifyPrice"));

        String message = modifyName+"메뉴의 가격을"+modifyPrice+"로 변경하였습니다.";
        model.addAttribute("message",message);

        return "first/messagePrinter";
    }

@GetMapping("search")
    public void search(){}

/* 설명. 핸들러 메소드에 우리가 작성한 클래스 (bean X, @Component X)
* 를 매개변수로 작성하면 스프링이 기본 생성자를 활용해서 객체를 만들어주고,
* setter로 값도 주입해준다. 이러한 클래스의 객체를 '커맨드 객체'라고 부른다.
*
* @ModelAttribute 어노테이션을 활용하면 커맨드 객체를 모델의
* attribute에 바로 담아주며 이 후, view의 재료로 사용 할 수 있다.
* (name 속성 작성 유무에 따라 화면에서 활용하는 방법이 다르다.)
* */
    @PostMapping("search")
    public String searchMenu(@ModelAttribute(name="menu")MenuDTO menu){
        System.out.println("menu = " + menu);
        return "first/searchResult";
    }

    @GetMapping("login")
    public void login(){}

    @PostMapping("login")
    public String sessionTest1(String id, String pwd
                            , HttpSession session) {

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        /* 설명. 넘어온 id와 pwd를 활용해 실제 db에서 회원 조회를 성공했다는 가정*/
        session.setAttribute("id", id); //id 이런건 변수일뿐
        session.setAttribute("pwd", pwd);
        session.setAttribute("name","홍길동");
        return "first/loginResult";
    }

    @GetMapping("logout1")
    public String logoutTest1(HttpSession session) {
        session.invalidate();
        return "first/loginResult";
    }

    @GetMapping("login2")
    public String logoutTest2(Model model, String id) {
        model.addAttribute("id", id);
        model.addAttribute("name","홍길동");
        return "first/loginResult";
    }


    @GetMapping("logout2")
    public String logoutTest2(SessionStatus sessionStatus){
        sessionStatus.setComplete();
        return "first/loginResult";
    }

    @GetMapping("body")
    public void body(){}

    @PostMapping("body")
    public void bodyTest(@RequestBody String body,
                         @RequestHeader("content-type") String contentType,
                         @CookieValue(value="JSESSIONID") String sessionID) {
        System.out.println("body = " + body);
        System.out.println("contentType = " + contentType);
        System.out.println("sessionID = " + sessionID);
    }
}
