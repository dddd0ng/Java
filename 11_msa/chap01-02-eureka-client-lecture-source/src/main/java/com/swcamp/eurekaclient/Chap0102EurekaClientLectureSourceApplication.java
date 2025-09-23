package com.swcamp.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //얘는 안붙여도 돌아는 감, 유레카서버는 안붙이면 안돌아감
public class Chap0102EurekaClientLectureSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap0102EurekaClientLectureSourceApplication.class, args);
    }

}
