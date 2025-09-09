package com.swcamp.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
/* 설명.
* ViewResolver(뷰 리졸버) : 인터페이스를 구현한 ThymeleafViewResolver가 현재 처리하게 된다.
* Thymeleaf
* * 접두사(prefix): classpath:/templates/
* 접미사(suffix): .html
* 핸들러 메소드가 반환하는 문자열은 뷰 리졸버로 향하게되고 'redirect:'가 들어간 문자열의 경우에는
* 접두사와 접미사가 추가되지 않는다.
* */

@Controller
public class ResolverController {
    @GetMapping("string")
    public String stringReturning(Model model) {
        model.addAttribute("forwardMessage", "문자열로 뷰 이름 반환함...");
        return "result";
    }
//    @GetMapping("string-redirect")
//    public String stringRedirect() {
//        return "redirect:/";
//    }
@GetMapping("string-redirect")
public String stringRedirect(Model model) {
        /* 설명. redirect되어 요청이 다시 왔을 때 응답되는 view의 재료로 담는걸 시도(model에 담긴 걸로는 전달x*/
        model.addAttribute("message1","문자열로 뷰 이름 반환하며 리다이렉트");
    return "redirect:/";
}



    @GetMapping("string-redirect-attr")

    public String stringRedirectFlashAttr(RedirectAttributes rttr) {

        /* 설명. 스프링부트에서 리다이렉트 시에 값이 전달되게 하고 싶다면 RedirectAttributes에 Flash Attribute로 추가한다..
        * 추가로, 내부적로는 HttpSession을 활용하기 때문에 Flash Attribute의 키 값이 기존 session의 키 값과 중복되면 xxxxx*/
        rttr.addFlashAttribute("flashMessage1","문자열로 뷰 이름 반환하며 리다이렉트");
        return "redirect:/";

    }

}
