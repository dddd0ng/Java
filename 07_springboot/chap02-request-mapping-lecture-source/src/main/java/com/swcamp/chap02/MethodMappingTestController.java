package com.swcamp.chap02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;

//@Controller만 붙이면 컨트롤러화, @RequestMapping 가능
@Controller//서블릿x컨트롤러o
public class MethodMappingTestController {

    //해당메서드 = 핸들러 메서드 (요청을 핸들링한다)
    /* 설명. 핸들러 메소드는 어노테이션으로 요청을 매핑하고 반환하는
    * 문자열로 view를 선택한다.(요청을 받아내고 페이지를 선정, 뷰. 페이지 컨트롤)*/
    @RequestMapping(value="/menu/regist")//  <= GET요청 뿐 아니라 다른 요청도 받을 수 있음.
//    @RequestMapping(value="/menu/regist",method=RequestMethod.GET)
// method=RequestMethod.GET <= GET요청만 받음


//    public String registMenu(){
//        System.out.println("/menu/regist 경로의 요청 받아보기");
//
//        return "mappingResult"; // view의 이름(view가 될 html의 이름)
//        //반환=templates으로, 맵핑.html로
//    }
    public String registMenu(Model model){
        System.out.println("/menu/regist 경로의 요청 받아보기");

        model.addAttribute("message","신규 메뉴 등록용 핸들러 메소드 호출함.....");

        return "mappingResult"; // view의 이름(view가 될 html의 이름)
        //반환=templates으로, 맵핑.html로

        //model에 담아두면 리다이렉트할때 값이 유지가됨
    }



}
//요청마다 서블릿을 만들 필요 없이 요청 별 메소드생성, 컨트롤러 클래스 하나로! 도메인별 컨트롤러 하나면 됨
