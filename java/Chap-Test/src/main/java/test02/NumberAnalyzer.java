package test02;

public class NumberAnalyzer {

    /**
     * 문제 4: 주어진 숫자까지의 짝수 합 구하기
     *
     * 1부터 주어진 숫자까지의 모든 짝수의 합을 구하는 프로그램을 작성하시오.
     * 예: input이 10이면 2 + 4 + 6 + 8 + 10 = 30을 반환
     *
     * 예상 출력:
     * [짝수의 합 계산 결과]
     * 1부터 10까지의 짝수의 합: 30
     * 1부터 5까지의 짝수의 합: 6
     * 1부터 20까지의 짝수의 합: 110
     * 1부터 1까지의 짝수의 합: 0
     *
     * @param number 주어진 숫자 (양의 정수)
     * @return 1부터 주어진 숫자까지의 모든 짝수의 합
     */
    public int sumOfEvenNumbers(int number) {
        int sum = 0;
        for (int i = 1; i <= number ; i++) {
            if((i % 2) == 0)
                sum+=i;
        }

        // 여기에 코드 작성(return 구문도 수정 필요하면 수정)
        return sum;
    }

    public static void main(String[] args) {
        NumberAnalyzer analyzer = new NumberAnalyzer();

        /* 테스트 케이스 */
        int[] testCases = {10, 5, 20, 1};

        System.out.println("[짝수의 합 계산 결과]");
        for (int number : testCases) {
            int sum = analyzer.sumOfEvenNumbers(number);
            System.out.println("1부터 " + number + "까지의 짝수의 합: " + sum);
        }
    }
}