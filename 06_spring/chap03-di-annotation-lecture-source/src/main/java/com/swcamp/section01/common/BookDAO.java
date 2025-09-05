package com.swcamp.section01.common;

import java.util.List;

public interface BookDAO {

    List<BookDTO> findAllBook();

    BookDTO findBookBySequenceOf(int sequence);

    //BookDTO findBookBySequence(int sequence); 위에 아님 아래 Of를 붙여 쓰기도 함
}
