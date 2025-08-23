package com.swcamp.Section01.singleresponsibility.problem;

/* 설명.
 *  단일 책임의 원칙(Single Reponsibility Principle) - "클래스의 책임이 너무 많거나 노출되면 안돼!"
 *   - 한 클래스는 하나의 책임만 가져야 된다.
 *   - 클래스가 변경되어야 하는 이유는 오직 하나여야 한다.
 *   - 캡슐화를 통해 클래스의 책임을 명확히 하고 구현 세부사항을 숨긴다.
 * */
public class Application1 {
    public static void main(String[] args) {
        BadEmployee badEmp = new BadEmployee();
        badEmp.saveEmployee();          // 사원 정보 DB 저장
        badEmp.reportWorkingHours();    // 근무시간 보고
        badEmp.applyPayRate();          // 직원의 급여 계산
    }
}