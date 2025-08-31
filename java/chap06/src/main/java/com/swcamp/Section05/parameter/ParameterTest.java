package com.swcamp.Section05.parameter;

import java.util.Arrays;

public class ParameterTest {
    public void testPrimitiveTypeParameter(int num) {
        System.out.println("메소드 안 num = "+num);
    }

    public void testPrimitiveArrayTypeParameter(int[] iArr) {
        iArr[0] = 10;
        System.out.println("메소드 안 iArr = "+ Arrays.toString(iArr));
    }

    public void testClassTypeParameter(Rectangle r) {
        r.calArea();
        r.calRound();
    }

    public void testVariableLengthArrayParameter(String... str) {
        System.out.println("넘어온 인자 출력 : " + Arrays.toString(str));
    }
}
