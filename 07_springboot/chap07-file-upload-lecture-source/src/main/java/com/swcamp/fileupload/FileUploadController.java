package com.swcamp.fileupload;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class FileUploadController {

//  application.yml에서 파일업로드 공통 경로를 불러와 변수에 대입.(키 값 잘 적어야함)

    @Value("${filepath}")
    private String filepath;

    //파일 업로드할때
    @PostMapping("single-file")
    public String singleFile(@RequestParam MultipartFile singleFile,
                             @RequestParam String singleFileDescription,
                             RedirectAttributes rttr){//요청이니까 requestParam
//singleFile = html에서 name과 같게(파일 이름)
        //singleFileDescription (파일 설명)


        /* 설명. 저장할 파일의 경로설정 후 파일 저장*/
        /* 설명. 업로드 되는 파일의 이름을 리네임(이름이 같을경우가 있으므로)
        /* (feat.날짜/시간,random, UUID(자바에서)*/
        /* 설명. DB로 보낼 데이터 만들기(Map<String,String>, List<Map<String,String>>*/
        //Users/dong/Desktop/02_java/fileUpload
        System.out.println("singleFile = " + singleFile);
        System.out.println("singleFileDescription = " + singleFileDescription);

        /* 설명. 사용자가 남긴 파일의 원본이름을 확인하고 rename해보기*/
        String originFileName = singleFile.getOriginalFilename();

        //확장자 추출
        String ext = originFileName.substring(originFileName.lastIndexOf("."));
        System.out.println("ext = " + ext);

        String saveName = UUID.randomUUID().toString().replace("-", "")+ext;
        System.out.println("saveName = " + saveName);

        /* 설명. 우리가 지정한 경로로 파일을 저장*/
        try {
            singleFile.transferTo(new File(filepath + "/single/"+saveName));

            /* 설명. (실패하면 db에 저장되면 안되니까) db로 보낼 데이터를 map형태로 가공처리*/
            Map<String,String> file = new HashMap<>();//맵이 아니라DTO형태로도 괜찮음
            file.put("originFileName",originFileName);
            file.put("saveName",saveName);
            file.put("filePath","/single/");
            file.put("singleFileDescription",singleFileDescription); //파일설명

            /* 설명. 이후 Service계층을 통해 DB에 사용자가 업로드한 하나의 파일에 대한 내용을 저장하고 옴*/

            rttr.addFlashAttribute("message",originFileName+"파일 업로드 성공!");
            rttr.addFlashAttribute("img","/single/"+saveName);
            rttr.addFlashAttribute("singleFileDescription",singleFileDescription);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //리다이렉트는 무조건 겟요청
        return "redirect:/result"; //result핸들러 페이지가 없으면 페이지에러뜸
        //포워드랑 리다이렉트로 어디로갈지
        //포워드는 새로고침하면 파일이 계속 업로드되니까 x
        //insert같은거는 리다이렉트로 (새로고침하면 계속 insert됨)
    }

    @GetMapping("result")
    public void result(){}
}
