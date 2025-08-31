package com.swcamp.Section04.interfacesegreation.resolved;

public class Application1 {
    public static void main(String[] args) {
    BasicPrinter bp = new BasicPrinter();
    bp.print();

    AdvancedPrinter ap = new AdvancedPrinter();
    ap.print();
    ap.fax();
    ap.scan();
    }
}
