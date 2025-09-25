package com.swcamp.userservice.dto;

import lombok.Data;

@Data
public class ResponseFindUserDTO {
    private String email;
    private String name;
    private String userId;
}
