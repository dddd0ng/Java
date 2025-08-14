package test03;

public class StudentGrade {
    private String name;        // 학생명
    private int[] scores;       // 점수들

    public StudentGrade(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    /**
     * 문제 9-1: 학생의 평균 점수 계산하기
     *
     * 학생의 시험 점수들이 배열로 주어질 때, 평균 점수를 계산하는 프로그램을 작성하시오.
     *
     * 예상 흐름:
     * 학생들과 학생별 획득 점수(배열)
     * 이 때 상품명과 상품의 단가가 같이 전달 된다.
     *
     * 예상 출력:
     * [학생 성적 분석 결과]
     * 홍길동 학생
     * 평균 점수: 90.0
     * 최고 점수: 95
     *
     * 김철수 학생
     * 평균 점수: 82.5
     * 최고 점수: 90
     *
     * @return 모든 점수의 평균값
     */
    public double calculateAverage() {

        // 여기에 코드 작성(return 구문도 수정 필요하면 수정)
        return 0.0;
    }

    /**
     * 문제 9-2: 최고 점수 찾기
     *
     * 학생의 시험 점수들 중 가장 높은 점수를 찾는 프로그램을 작성하시오.
     * (출력 예시는 위의 문제와 동일하다.)(
     *
     * @return 최고 점수
     */
    public int findHighestScore() {

        // 여기에 코드 작성(return 구문도 수정 필요하면 수정)
        return 0;
    }

    public static void main(String[] args) {

        /* 테스트 케이스 */
        String[] names = {"홍길동", "김철수"};
        int[][] scoresList = {
                {85, 90, 95},
                {75, 80, 85, 90}
        };

        System.out.println("[학생 성적 분석 결과]");
        for (int i = 0; i < names.length; i++) {
            StudentGrade student = new StudentGrade(names[i], scoresList[i]);

            double average = student.calculateAverage();
            int highest = student.findHighestScore();

            System.out.println(names[i] + " 학생");
            System.out.println("평균 점수: " + average);
            System.out.println("최고 점수: " + highest);
            System.out.println(); // 빈 줄 출력
        }
    }
}
