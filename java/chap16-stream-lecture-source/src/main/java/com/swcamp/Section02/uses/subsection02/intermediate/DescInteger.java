package com.swcamp.Section02.uses.subsection02.intermediate;

import java.util.Comparator;

public class DescInteger implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -(o1 - o2);  // auto-unboxing으로 int - int
    }
}