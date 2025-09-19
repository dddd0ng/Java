package com.swcamp.springdatajpa.common;

import com.swcamp.springdatajpa.menu.dto.MenuDTO;
import org.springframework.data.domain.Page;

public class Pagination {
    public static PagingButtonInfo getPagingButtonInfo(Page page) {
        int currentPage = page.getNumber() + 1;
        //0page부터 나오는곳은 없으므로 1page부터 (+1)
        int defaultButtonCount = 10; // server쪽에서 정하는것.(프론트랑 합의 하고)
        int startPage;
        int endPage;






        return null;
    }
}
