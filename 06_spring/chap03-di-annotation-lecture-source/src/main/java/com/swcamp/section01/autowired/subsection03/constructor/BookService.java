package com.swcamp.section01.autowired.subsection03.constructor;

import com.swcamp.section01.common.BookDAO;
import com.swcamp.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("constructorService") //Service("") 같은 이름이 달려있음 안되니까 ("별칭")
public class BookService {


    private final BookDAO bookDAO;

    /* 설명.
     *  BookDAO 타입의 빈 객체를 생성자를 통해 주입 받는다.
     *  (기본생성자 사용 X)
     *
     * 설명.
     *  생상자 주입의 이점
     *  1. 필드에 final 키워드를 사용할 수 있다.(오염 방지)
     *  2. 순환참조를 스프링 시작(컨테이너 생성 시)과 동시에 확인하고 에러를 발생시켜 준다.
     *  3. field 주입 및 setter 주입의 단점을 보완
     *     (필드 주입은 간결하지만 남용할 수 있고 이후에 setter가 없이는 수정이 불가능하다.)
     *     (setter 주입은 불변 객체를 만들고자 함에 있어 문제가 발생할 수 있으면 정말 필요한 객체의 속성
     *     변경을 위해서만 setter를 추가하는 것이 맞다.(feat. 가급적 변경의 여지를 남기지 않아야 한다.))
     *  4. 테스트 코드 작성이 용이하다.(생성자 주입은 @InjectMocks를 사용하지 않고 그 자리에서 객체를 생성해서 쉽게 할 수 있음)
     * */
    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }

    public BookDTO findBookBySequenceOf(int sequence) {
        return bookDAO.findBookBySequenceOf(sequence);
    }
}
