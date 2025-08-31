package com.swcamp.parameterized.Section01.params;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;


/* 설명. 따로 테스트 케이스들을 모듈화 할 목적으로 클래스로 뺴낼 수 있다.*/
public class SumTwoNumbersArgumentsProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of(1,2,3),
                Arguments.of(3,4,7),
                Arguments.of(10,20,30),
                Arguments.of(123,234,345),
                Arguments.of(258,369,418)

        );
    }
}
