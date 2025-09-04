package com.swcamp.section01.autowired.subsection01.field;

import com.swcamp.section01.common.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//di에서 필드주입 학습
@Service //서비스 계층도 서비스계층의 클래스인지 컴포넌트
//다른 기능은없고 서비스 계층인지 (주석느낌)
public class BookService { // 뭘 의존하는지 -> db에 친한친구? 트랜잭션의 시작,DAO계층에 의존

    /* 설명. 필드에 @Autowired를 추가하면
    * 필드를 통한 의존성 객체 주입(bean 주입)
    * 으로 필드 주입이라고 한다.
    * */

    @Autowired //(자동으로 연결해줘 같은 느낌)
    private BookDAO bookDAO; // bookdao (could not autowire -> bookdao에는 연결된애가없어서
    //BookDAOImpl엔 어노테이션있어서 bookdao implements

}
