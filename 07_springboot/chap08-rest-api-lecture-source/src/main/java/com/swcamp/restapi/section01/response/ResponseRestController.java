package com.swcamp.restapi.section01.response;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


// json -> 객체형태, 배열형태
//@Controller
@RestController //이 컨트롤러의 모든 핸들러 메소드의 응답은 view resolver를 활용하지 않는다.(SSR X)
@RequestMapping("/response")
public class ResponseRestController {
    @GetMapping("/hello")
//    @ResponseBody //이걸 붙인 순간부터는 view resolver로 안감
    //핸들러 메소드에 응답이 json형태로 되며 자바의 모든 타입 반환이 가능해진다.
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/random")
    public int getRandomNumber() {
        return (int)(Math.random()*10)+1;
    }

    @GetMapping("/test")
    public List<Map<String, Object>> getTest() {
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("test1",new Message(200,"성공1"));
        map.put("test2",new Message(200,"성공2"));
        map.put("MaxPageLink","http://localhost:8080/hello");
        list.add(map);

        return list;
    }

    /* 설명. Http상태코드를 key로, 메시지를 value로 하는 Map형태로 반환*/
    @GetMapping("/map")
    public Map<Integer,String> getMapping(){
        List<Message> messageList = new ArrayList<>();
        messageList.add(new Message(200,"정상응답"));
        messageList.add(new Message(404,"페이지를 찾을 수 없습니다"));
        messageList.add(new Message(500,"개발자의 잘못입니다."));

        return messageList.stream()
                .collect(Collectors.toMap(Message::getHttpStatusCode, Message::getMessage));
    }

    /* 이미지 응답하기 (파일 업로드는 배웠는데 파일 업로드된걸 뿌려야함)*/
    /* 1. byte[] 방식: Files.readAllBytes() -> 파일 시스템에서 매번 직접 읽기
     * 2. WebConfig 방식:
     * 3. Resource 방식:
     * */

    //byte[] 방식
@GetMapping(value="/image/bytes/{filename}", produces= MediaType.IMAGE_PNG_VALUE)
//아래 형식처럼도 가능(여러 방식 사용할때)
//@GetMapping(value="/image/bytes/{filename}", produces= {MediaType.IMAGE_PNG_VALUE, MediaType.IMAGE_JPEG_VALUE})
public byte[] getImageWithbytes(@PathVariable String filename) throws IOException {
    Path path = Paths.get("/Users/dong/Downloads/"+filename+".png");
    //경로상 확장자명 안써줘서 직접 써주기
byte[] imageData =  Files.readAllBytes(path);
return imageData;
}

//WebConfig 방식
    @GetMapping
}
