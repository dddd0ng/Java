package test02;

public class PrimeChecker {

    /**
     * 문자 6: 소수 판별하기
     *
     * 주어진 숫자가 소수인지 판별하는 프로그램을 작성하시오.
     * 소수는 1과 자기 자신으로만 나누어 떨어지는 수이다.
     * 또한 1은 소수가 아니다.
     *
     * 예상 출력:
     * [소수 판별 결과]
     * 2는 소수입니다.
     * 17은 소수입니다.
     * 15는 소수가 아닙니다.
     * 1은 소수가 아닙니다.
     *
     * @param number 판별 할 숫자
     * @return 소수이면 true, 아니면 false
     */
    public boolean isPrime(int number) {

        // 여기에 코드 작성(return 구문도 수정 필요하면 수정)
        return false;
    }

    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker();

        /* 테스트 케이스 */
        int[] testCases = {2, 17, 15, 1};

        System.out.println("[소수 판별 결과]");
        for (int number : testCases) {
            boolean isPrime = checker.isPrime(number);
            System.out.println(number + "는 " + (isPrime ? "소수입니다." : "소수가 아닙니다."));
        }
    }
}
