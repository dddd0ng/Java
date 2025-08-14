package com.swcamp.Section04.override;

import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {

        SuperClass superClass = new SubClass();
        try {
            superClass.method();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}