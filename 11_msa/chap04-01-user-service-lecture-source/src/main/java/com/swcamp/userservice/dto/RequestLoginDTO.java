package com.swcamp.userservice.dto;

import lombok.Data;

@Data
public class RequestLoginDTO {
    private String email;
    private String pwd;
}
