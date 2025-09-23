package com.swcamp.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FirstServiceController {

    //Environment : @Value와 같이 application.yml 또는 컴퓨터 환경변수를 불러 오기 위한 객체
    private Environment env;
@Autowired
    public FirstServiceController(Environment env) {
        this.env = env;
    }

    @GetMapping("/health")
    public String healthCheck(){
    //environment를 활용해서 local.server.port를 가져오면
        //동적으로 할당 된 실제 포트번호 확인 가능
        //대시보드에서 Status눌러서 들어가고 뒤에 주소 지우고 /health작성)
        return "I'm OK, 포트는"+env.getProperty("local.server.port");
        //("local.server.port");이걸 써줘야 포트번호 적어줌
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header){
        log.info("넘어온 헤더 : {}", header);
        return "First Service Message";
    }
}
