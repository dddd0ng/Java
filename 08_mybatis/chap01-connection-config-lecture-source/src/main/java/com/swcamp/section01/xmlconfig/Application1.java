package com.swcamp.section01.xmlconfig;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Application1 {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";

        /* 설명. JDBC에서의 connection 객체 같은 개념*/
        SqlSession session = null;
//stream => exception처리가 필요
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //위에 코드 = 설계도라 생각
            SqlSessionFactory sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(inputStream);

            session = sqlSessionFactory.openSession(false);
            //false를 넘겨줘야 수동 커밋 가능(두가지 다 만족을 해야) , false를 안던지면 디폴트는true

            java.util.Date nowDate = session.selectOne("mapper.selectNow"); // mapper.xml에서 select id값과 같아야함
            System.out.println("Now date: " + nowDate);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            session.close();
        }
    }
}
