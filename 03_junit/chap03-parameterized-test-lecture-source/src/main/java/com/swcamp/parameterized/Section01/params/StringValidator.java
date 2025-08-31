package com.swcamp.parameterized.Section01.params;

public class StringValidator {
    public static boolean isNull(String input) {
        return input == null;
    }

    public static boolean isEmpty(String input) {
        return "".equals(input);
    }
}
