package test01;

public class TemperatureConverter {

    /**
     * 문제 2: 섭씨 온도를 화씨 온도로 변환하기
     *
     * 섭씨 온도가 주어졌을 때, 이를 화씨 온도로 변환하는 프로그램을 작성하시오.
     * 변환 공식: (섭씨 * 9/5) + 32 = 화씨
     *
     * 예상 출력:
     * [온도 변환 결과]
     * 섭씨 0.0도는 화씨 32.0도입니다.
     * 섭씨 100.0도는 화씨 212.0도입니다.
     * 섭씨 25.0도는 화씨 77.0도입니다.
     * 섭씨 -40.0도는 화씨 -40.0도입니다.
     *
     * @param celsius 섭씨 온도
     * @return 변환된 화씨 온도
     */
    public double celsiusToFahrenheit(double celsius) {

        double answer = (celsius * 1.8) + 32;
        // 여기에 코드 작성(return 구문도 수정 필요하면 수정)
        return answer;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        /* 테스트 케이스 */
        double[] testCases = {0, 100, 25, -40};

        System.out.println("[온도 변환 결과]");
        for (double celsius : testCases) {
            double fahrenheit = converter.celsiusToFahrenheit(celsius);
            System.out.println("섭씨 " + celsius + "도는 화씨 " + fahrenheit + "도입니다.");
        }
    }
}