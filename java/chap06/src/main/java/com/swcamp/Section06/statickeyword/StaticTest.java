package com.swcamp.Section06.statickeyword;

public class StaticTest {
    private int nonStaticCount;
    private static int staticCount;

    public StaticTest() {
    }

    public static int getStaticCount() {
        return staticCount;
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public int increaseNonStaticCount() {
        return this.nonStaticCount++;
    }


    public static int increaseStaticCount() {
        return staticCount;
    }


}


