package test01;

public class CircleCalculator {
    /* 설명.
     *  chap01: 변수, 연산자
     *  chap02: 메소드와 API, 제어문
     *  chap03: 배열, 클래스와 객체
     * */

    /**
     * 문제 1: 원의 넓이 계산하기
     *
     * 원의 반지름이 주어졌을 때, 원의 넓이를 계산하는 프로그램을 작성하시오.
     * 공식: 원의 넓이 = π * r * r
     * π(원주율)은 3.14159를 사용한다.
     *
     * 예상 출력:
     * [원의 넓이 계산 결과]
     * 반지름이 1.0인 원의 넓이: 3.14159
     * 반지름이 2.5인 원의 넓이: 19.63494
     * 반지름이 5.0인 원의 넓이: 78.53975
     *
     * @param radius 원의 반지름
     * @return 원의 넓이
     */
    public double calculateArea(double radius) {
        double PI=3.14159;
        double answer=PI*radius*radius;
        // 여기에 코드 작성(return 구문도 수정 필요하면 수정)
        return answer;
    }

    public static void main(String[] args) {
        CircleCalculator calculator = new CircleCalculator();

        /* 테스트 케이스 */
        double[] testCases = {1.0, 2.5, 5.0};

        System.out.println("[원의 넓이 계산 결과]");
        for (double radius : testCases) {
            double area = calculator.calculateArea(radius);
            System.out.println("반지름이 " + radius + "인 원의 넓이: " + area);
        }
    }
}
