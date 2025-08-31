package com.swcamp.Section03.filterstream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/* 설명. 우리만의 헤더 추가만 안되는 ObjectOutputStream 생성 */
public class MyOutput extends ObjectOutputStream {
    public MyOutput(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();

        /* 설명. 객체를 파일로 출력할 시 헤더의 개념이 추가되지 않도록 기능 제거 */
    }
}