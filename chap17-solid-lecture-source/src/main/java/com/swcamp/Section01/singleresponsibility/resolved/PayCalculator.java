package com.swcamp.Section01.singleresponsibility.resolved;

public class PayCalculator {
    public void applyPayRate(Employee emp) {
        int pay = emp.getWorkingHours() * emp.getPayRate(); // 일한 시간 * 시급
        System.out.println(emp.getName() + "의 급여를 계산합니다. " + pay + "원");
    }
}
