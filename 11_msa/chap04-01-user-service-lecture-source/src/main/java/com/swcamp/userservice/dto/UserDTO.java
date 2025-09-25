package com.swcamp.userservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private String email;
    private String name;
    private String pwd;

    // ServiceImpl 계층에서 고유 회원 아이디 생성하며 추가(응답할때도 활용)
    private String userId;

    /* 설명. FeignClient 이후(회원이 주문한 내역도 담기)*/
    List<ResponseOrderDTO> orders;
}
