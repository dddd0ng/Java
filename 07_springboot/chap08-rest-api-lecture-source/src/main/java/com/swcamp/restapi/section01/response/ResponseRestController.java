package com.swcamp.restapi.section01.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
@RestController //이 컨트롤러의 모든 핸들러 메소드의 응답은 view resolver를 활용하지 않는다.(SSR X)
@RequestMapping("/response")
public class ResponseRestController {
    @GetMapping("/hello")
//    @ResponseBody //이걸 붙인 순간부터는 view resolver로 안감
    //핸들러 메소드에 응답이 json형태로 되며 자바의 모든 타입 반환이 가능해진다.
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/random")
    public int getRandomNumber() {
        return (int)(Math.random()*10)+1;
    }

    @GetMapping("/test")
    public List<Map<String, Object>> getTest() {
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("test1",new Message(200,"성공1"));
        map.put("test2",new Message(200,"성공2"));
        map.put("MaxPageLink","http://localhost:8080/hello");
        list.add(map);

        return list;
    }
    // 객체형태, 배열형태
}
