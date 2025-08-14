package test02;

public class PatternFinder {

    /**
     * 문제 5: 문자열에서 특정 패턴의 개수 찾기
     *
     * 주어진 문자열에서 특정 패턴이 몇 번 나타나는지 찾는 프로그램을 작성하시오.
     * 대소문자를 구분하지 않는다.
     * 패턴은 연속된 문자여야 한다.(정규표현식 X)
     * ("문자열".toLowerCase()는 문자열의 알파벳을 모두 소문자로 바꾼다.)
     * ("문자열".indexOf(pattern, index)는 index 위치에 있는 문자부터
     * 오른쪽으로 한칸씩 이동하며 찾아지는 최초의 문자열의 위치를 반환하며
     * 없으면 -1을 반환한다.)
     *
     * 예상 출력:
     * [패턴 찾기 결과]
     * "Hello Hello HELLO"에서 "hello"는 3번 나타납니다.
     * "banana"에서 "ana"는 2번 나타납니다.
     * "Java Programming"에서 "gram"은 1번 나타납니다.
     *
     * @param text 검색 대상 문자열
     * @param pattern 찾을 패턴
     * @return 패턴이 나타난 횟수
     */
    public int findPattern(String text, String pattern) {
          text.toLowerCase();
        // 여기에 코드 작성(return 구문도 수정 필요하면 수정)
        return 0;
    }

    public static void main(String[] args) {
        PatternFinder finder = new PatternFinder();

        /* 테스트 케이스 */
        String[] texts = {"Hello Hello HELLO", "banana", "Java Programming"};
        String[] patterns = {"hello", "aNa", "GRAM"};

        System.out.println("[패턴 찾기 결과]");
        for (int i = 0; i < texts.length; i++) {
            int count = finder.findPattern(texts[i], patterns[i]);
            System.out.println("\"" + texts[i] + "\"에서 \"" + patterns[i] + "\"는 "
                    + count + "번 나타납니다.");
        }
    }
}