package com.swcamp.restapi.section01.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseRestController {
    @GetMapping("/hello")
    @ResponseBody //이걸 붙인 순간부터는 view resolved로 안감
    public String helloWorld() {
        return "Hello World!";
    }
}
