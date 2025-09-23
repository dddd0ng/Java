package com.swcamp.userservice.controller;

import com.swcamp.userservice.dto.HelloDTO;
import com.swcamp.userservice.dto.RequestRegistUserDTO;
import com.swcamp.userservice.dto.ResponseRegistUserDTO;
import com.swcamp.userservice.dto.UserDTO;
import com.swcamp.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j // log찍을거면 넣어주깅
public class UserController { //얘도 하나의 microservice

    private Environment env; //springframework꺼 가져오기
    private HelloDTO hello;
    private UserService userService;
    private ModelMapper modelMapper;



    //의존성 주입을 받기위해 컴포넌트
    @Autowired
    public UserController(Environment env, HelloDTO hello,UserService userService, ModelMapper modelMapper) {
        this.env = env;
        this.hello = hello;
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    // microservice는 이런식으로 요청(겟매핑)
    @GetMapping("/health")
    public String status(){
        return "I'm Working in User Service"+env.getProperty("local.server.port");
    }

    @GetMapping("/welcome")
    public String welcome(){
        return hello.getMessage();
    }
//여기부터 DTO가 많이 들어감
    //로그인 기능 전 회원가입 기능 먼저 만들기
    @PostMapping("/users")
    public ResponseEntity<ResponseRegistUserDTO> registUser(@RequestBody RequestRegistUserDTO newUser){
        UserDTO userDTO = modelMapper.map(newUser, UserDTO.class);

    userService.registUser(userDTO);
    ResponseRegistUserDTO responseUser = modelMapper.map(userDTO, ResponseRegistUserDTO.class);
    return ResponseEntity.status(HttpStatus.CREATED).body(responseUser);
    }
}
