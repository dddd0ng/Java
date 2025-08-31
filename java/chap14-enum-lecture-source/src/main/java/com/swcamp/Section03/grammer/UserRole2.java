package com.swcamp.Section03.grammer;
//singleton에서 setter X
public enum UserRole2 {
    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    private final String DESCRIPTION;
    UserRole2(String description) {
        this.DESCRIPTION = description;
    }

}
