package com.swcamp.Section04.interfacesegreation.resolved;

public class BasicPrinter implements PrintOnly {
    @Override
    public void print() {
        System.out.println("깔끔하게 문서를 출력합니다.");
    }
}
