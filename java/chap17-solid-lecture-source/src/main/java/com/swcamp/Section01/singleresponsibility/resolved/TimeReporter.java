package com.swcamp.Section01.singleresponsibility.resolved;

public class TimeReporter {
    public void reportHours(Employee emp) {
        validateWorkingHours(emp);
        System.out.println(emp.getName() + "의 근무 시간을 보고합니다: " + emp.getWorkingHours());
    }

    private void validateWorkingHours(Employee emp) {
        if (emp.getWorkingHours() > 52) {
            System.out.println("경고: 주 52시간을 초과하는 근무시간이 기록되었습니다.");
        }
    }
}
