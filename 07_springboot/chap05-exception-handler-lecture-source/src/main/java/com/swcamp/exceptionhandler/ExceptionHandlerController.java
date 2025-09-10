package com.swcamp.exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class ExceptionHandlerController {

    @GetMapping("simple-null")
    public String simpleNullPointerException(){
        if(true) { //잠시 컴파일러를 속이기위해 unreachable 컴파일 에러를 해소
            throw new NullPointerException();
        }
        return "test"; //view이름을 써야하는데 "/" <=
    }

    @GetMapping("simple-user")
    public String userExceptionTest() throws MemberRegistException {
        if(true) {
            throw new MemberRegistException("안돼");
        }
        return "test";
    }
    @GetMapping("annotation-null")
    public String nullPointerExceptionHandlerTest(){
        String str=null;
        str.charAt(0);

        return "test";
    }

    @ExceptionHandler(NullPointerException.class)
    public String nullPointerExceptionHandler(){
        System.out.println("이 Controller에서 NullPointer예외 발생 시 여기 오는지 확인");

        return "error/default";
    }


    @GetMapping("annotation-user")
    public String userExceptionHandlerTest() throws MemberRegistException {
        if(true) {
            throw new MemberRegistException("안돼");
        }

        return "test";
    }

    @ExceptionHandler(MemberRegistException.class)
    public String userExceptionHandlerTest(Model model){
        System.out.println("이 Controller에서 MemberRegist 예외 발생 시 여기 오는지 확인");

        /* 설명. @ExceptionHandler로 해당 컨트롤러별 예외처리를 하면 전역 설정이 사라짐, 필요하면 model에 재료 추가*/

        model.addAttribute("exceptionMessage", "안돼!!");

        return "error/default";
    }
}
