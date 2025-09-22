package com.swcamp.restapi.section02.responseentity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ResponseEntityTestController {
    private List<UserDTO> users;

    public ResponseEntityTestController() {
        this.users = new ArrayList<>();
        users.add(new UserDTO(1,"user01","pass01", "홍길동",new java.util.Date()));
        users.add(new UserDTO(2,"user02","pass02", "유관순",new java.util.Date()));
        users.add(new UserDTO(3,"user03","pass03", "이순신",new java.util.Date()));
    }

    @GetMapping("/users")
    public ResponseEntity<ResponseMessage> findAllUsers(){
        HttpHeaders heards = new HttpHeaders();

        heards.setContentType(
                new MediaType("application", "json", Charset.forName("UTF-8"))
        );

        //직접 만든것
    Map<String,Object> responseMap = new HashMap<>();
    responseMap.put("users", users);

    //직접 만든것
    ResponseMessage responseMessage = new ResponseMessage(200,"조회 성공",responseMap);

    return new ResponseEntity<>(responseMessage,heards, HttpStatus.OK);
    }

}
