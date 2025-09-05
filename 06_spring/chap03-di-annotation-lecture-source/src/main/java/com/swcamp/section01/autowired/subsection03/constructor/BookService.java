package com.swcamp.section01.autowired.subsection03.constructor;

import com.swcamp.section01.common.BookDAO;
import com.swcamp.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("constructorService") //Service("") 같은 이름이 달려있음 안되니까 ("별칭")
public class BookService {
    
    /* 설명. */
    
    
    
    private BookDAO bookDAO;

    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }

    public BookDTO findBookBySequenceOf(int sequence) {
        return bookDAO.findBookBySequenceOf(sequence);
    }


    //필드 주입이 아닌 세터 주입이라 세터가 있어야함
    //필드에서 호출하는게 아니라 세터를 통해서 호출
    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        System.out.println("setter 활용");
        this.bookDAO = bookDAO;
    }
}
