package com.swcamp.Section01.singleresponsibility.problem;

public class BadEmployee {
    private String name;
    private int workingHours;
    private int payRate;

    public BadEmployee() {
    }

    public void saveEmployee() {
        System.out.println("직원 정보를 데이터 베이스에 저장");
    }

    public void reportWorkingHours() {
        System.out.println("근무시간 보고");
    }

    public void applyPayRate() {
        System.out.println("급여 정산");
    }
}
