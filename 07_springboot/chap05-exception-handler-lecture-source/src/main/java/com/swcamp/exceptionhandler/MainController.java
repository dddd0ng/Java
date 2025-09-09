package com.swcamp.exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value={"/","/main"})
    public String main(){ // @RequestMapping ~~~ return "main"; <=이렇게하면 항상 main.html으로
        return "main";
    }

}
