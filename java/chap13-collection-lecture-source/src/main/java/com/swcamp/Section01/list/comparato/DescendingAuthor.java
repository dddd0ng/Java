package com.swcamp.Section01.list.comparato;

import com.swcamp.Section01.list.dto.BookDTO;

import java.util.Comparator;

public class DescendingAuthor implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getAuthor().compareTo(o2.getAuthor()); // 오름차순
//        return -o1.getAuthor().compareTo(o2.getAuthor()); // 내림차순
    }
}
