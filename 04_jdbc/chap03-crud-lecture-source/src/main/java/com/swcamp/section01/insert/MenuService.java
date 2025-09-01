package com.swcamp.section01.insert;

import java.io.FileNotFoundException;
import java.sql.Connection;

import static com.swcamp.common.JDBCTemplate.*;


/* 설명. Service계층은 Connection객체 생성 및 소멸(하나의 트랜잭션 단위)
 * 및 비즈니스 로직, 트랜잭션 처리(commit/rollback)를 담당*/
public class MenuService {
    public void registMenu(Menu menu) {
        Connection con = getConnection();

        MenuRepository repository = new MenuRepository(); // Repository or DAO (data access object)
        int result = repository.insertMenu(menu, con);
        
        /* 설명. DML작업은 기본적으로 트랜잭션당 하나의 DML작업이더라도 성공/실패에 대한 로직 작성*/
        if(result == 1) {
            /* 설명. insert 성공 시 commit*/
            commit(con);
        }else {
            /* 설명. insert 실패 시 rollback*/
            rollback(con);
            
        }

        close(con);

    }
}
