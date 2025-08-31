package com.swcamp.Section03.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application2  {
    public static void main(String[] args) {
        //프로퍼티즈 타입 <= 맵<스트링, 스트링>
        /* 설명. Properties에 대해 이해하고 활용 할 수 있다.*/
        //프로퍼티즈 쓰는 이유 - 외부 리소스랑 파일 입출력 용이한 타입
        //Properties -> XML -> Annotation -> yml(yaml)
        Properties prop = new Properties();
        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
        prop.setProperty("user", "swcamp");
        prop.setProperty("password", "swcamp");

        System.out.println("prop = " + prop);

        //출력을 내보내는 스트림 , 폴더에 driver.dat 파일 생김
        try {
//            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver xml version");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Properties prop2 = new Properties();
        System.out.println("읽어오기 전 : "+prop2);
        //load = 저장했다 불러옴
        try {
//            prop2.load(new FileInputStream("driver.dat"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("======읽어와서 담긴 값========");
        System.out.println("드라이버 : " + prop2.getProperty("driver"));
        System.out.println("경로 : "+prop2.getProperty("url"));
        System.out.println("아이디 : "+ prop2.getProperty("user"));
        System.out.println("패스워드 : " + prop2.getProperty("password"));
    }
}

// ? 환경설정,변수는 외부 리소스로 빼게돼있음?