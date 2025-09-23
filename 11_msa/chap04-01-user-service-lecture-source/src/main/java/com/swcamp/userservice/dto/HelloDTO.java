package com.swcamp.userservice.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // bean
@Data
public class HelloDTO {
    @Value("${hello.message}") //environment랑 똑같은거
    //이건 yml에서 직접 작성해야하는 값
    private String message;
}
