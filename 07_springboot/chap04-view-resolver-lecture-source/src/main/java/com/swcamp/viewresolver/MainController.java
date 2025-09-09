package com.swcamp.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//컨트롤러 어노테이션 해줘야 리퀘스트매핑 쓸수있음
@Controller
public class MainController {
//    @RequestMapping("/")
//    public String defaultLocation() {
//        return "main";
//    }
//
//    @RequestMapping("/main")
//    public void main() {}

    @RequestMapping(value={"/", "/main"})
    public String main() {return "main";}
}
