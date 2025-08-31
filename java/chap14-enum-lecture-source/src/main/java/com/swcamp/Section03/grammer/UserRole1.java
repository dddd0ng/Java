package com.swcamp.Section03.grammer;

public enum UserRole1 {
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;
    // 각 필드에 들어갈 객체들에 소문자로 필드명을 반환받는 단순한 메소드 추가해보기
    public String getNameToLowerCase(){
        return this.name().toLowerCase();
    }
}
