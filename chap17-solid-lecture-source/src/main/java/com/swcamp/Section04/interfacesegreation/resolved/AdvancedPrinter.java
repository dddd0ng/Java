package com.swcamp.Section04.interfacesegreation.resolved;

public class AdvancedPrinter implements MultiFunctionPrinter{
    @Override
    public void fax() {
        System.out.println("팩스를 보냅니다.");
    }

    @Override
    public void print() {
        System.out.println("문서를 깔끔하게 출력합니다.");
    }

    @Override
    public void scan() {
        System.out.println("스캔도 가능합니다.");
    }
}
