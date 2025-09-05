package com.swcamp.section01.autowired.subsection01.field;

import com.swcamp.section01.common.BookDAO;
import com.swcamp.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//서비스=DAO

//순수자바, 순수xml
//어노테이션을 활용 스프링


//di에서 필드주입 학습
@Service //서비스 계층도 서비스계층의 클래스인지 컴포넌트
//다른 기능은없고 서비스 계층인지 (주석느낌)
public class BookService { // 뭘 의존하는지 -> db에 친한친구? 트랜잭션의 시작,DAO계층에 의존
//서비스 -> 도메인 이벤트1개씩
    /* 설명. 필드에 @Autowired를 추가하면
    * 필드를 통한 의존성 객체 주입(bean 주입)
    * 으로 필드 주입이라고 한다.
    * */


    //어떤식으로 주입되는지, 뭐가 들어오는지 이해 할 줄 알아야함

    @Autowired //(자동으로 연결해줘 같은 느낌)
    private BookDAO bookDAO; // bookdao (could not autowire -> bookdao에는 연결된애가없어서

    public List<BookDTO> findAllBook() {
        //실제로는 디비로 가야되는데 디비랑 친한 계층은 아님
        return bookDAO.findAllBook();
    }

    public BookDTO findBookBySequence(int sequence) {
        return bookDAO.findBookBySequence(sequence);
    }
//   위에랑 같은값 private BookDAO bookDAO = new BookDAOImpl();
    //BookDAOImpl엔 어노테이션있어서 bookdao implements
    //순수 어노테이션방식을 하면 필드주입가능.알아서 스프링컨테이너 안에 bean을 찾아서 객체를 넣어줌
}
