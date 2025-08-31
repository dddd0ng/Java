package com.swcamp.Section01.singleresponsibility.resolved;

/* 설명.
 *  단일 책임의 원칙을 바르게 적용한다면 각가의 책임을 별도의 클래스로 분리하고
 *  각 클래스는 자신의 데이터와 연산을 최대한 캡슐화 해서 관리한다.
 * */
public class Application1 {
    public static void main(String[] args) {

        /* 설명. 이름, 근무시간, 시급이 설정된 객체 생성 */
        Employee emp = new Employee("홍길동", 40, 25000);

        /* 설명. 급여 계산 */
        PayCalculator payCalculator = new PayCalculator();
        payCalculator.applyPayRate(emp);

        /* 설명. 데이터베이스에 저장 */
        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.save(emp);

        /* 설명. 근무시간 보고 */
        TimeReporter timeReporter = new TimeReporter();
        timeReporter.reportHours(emp);
    }
}