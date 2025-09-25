package com.swcamp.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseRegistUserDTO {
    private String email;
    private String name;
    private String userId; //회원가입 이후 생성된 회원 고유번호

}
