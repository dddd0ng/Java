package com.swcamp.Section01.generics;

public class GenericTest<T> {
    private T value;

    public GenericTest() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}