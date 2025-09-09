package com.swcamp.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResolverController {
    @GetMapping("string")
    public String stringReturning(Model model){
        model.addAttribute("forwardMessage","문자열로 뷰 이름 반환함...");
        return "result";
    }
}
