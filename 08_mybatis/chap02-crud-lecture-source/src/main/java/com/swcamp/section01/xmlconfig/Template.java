package com.swcamp.section01.xmlconfig;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


//sqlSessionFactory가 필요할때마다 쓰는 모듈화

/* 설명. SqlSession 객체를 반환하는 Mybatis 관련 코드 모듈(모듈화)*/
public class Template {
    private static SqlSessionFactory sqlSessionFactory;

    /* 설명. Lazy Singleton방식으로 작성*/
    public static SqlSession getSqlSession(){
        if(sqlSessionFactory==null){
            String resource = "com/swcamp/section01/xmlconfig/mybatis-config.xml";

            try {
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return sqlSessionFactory.openSession(false);
        // 싱글톤하게 생성된 Factory에서 ConnectionPool에 있는 SqlSession 반환
    }
}
