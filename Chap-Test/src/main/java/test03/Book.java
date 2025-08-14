package test03;

public class Book {
    private String title;       // 책 제목
    private String author;      // 저자
    private int year;           // 발간년도
    private boolean borrowed;   // 대출 상태(여부)

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = false;
    }

    /**
     * 문제 7: 도서 대출/반납 관리하기
     *
     * 도서관의 책 대출/반납을 관리하는 프로그램을 작성하시오.
     * 이미 대출 중인 책은 대출할 수 없다.
     * 대출 중이 아닌 책은 반납할 수 없다.
     *
     * 예상 흐름:
     * 1. 최초 도서 대출
     * 2. 도서 대출 상태에서 다시 대출
     * 3. 최초 도서 반납
     * 4. 도서 반납 상태에서 다시 반납
     *
     * 예상 출력:
     * [도서 대출/반납 관리]
     * '자바의 정석'이(가) 대출되었습니다.
     * '자바의 정석'은(는) 이미 대출 중입니다.
     * '자바의 정석'이(가) 반납되었습니다.
     * '자바의 정석'은(는) 대출 중이 아닙니다.
     *
     * @return 대출/반납 성공 시 true, 실패 시 false
     */
    public boolean borrowBook() {

        // 여기에 코드 작성(return 구문도 수정 필요하면 수정)
        return false;
    }

    public boolean returnBook() {

        // 여기에 코드 작성(return 구문도 수정 필요하면 수정)
        return false;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book book = new Book("자바의 정석", "남궁성", 2019);

        System.out.println("[도서 대출/반납 관리]");

        /* 대출 테스트 */
        if (book.borrowBook()) {
            System.out.println("'" + book.getTitle() + "'이(가) 대출되었습니다.");
        }

        /* 중복 대출 테스트 */
        if (!book.borrowBook()) {
            System.out.println("'" + book.getTitle() + "'은(는) 이미 대출 중입니다.");
        }

        /* 반납 테스트 */
        if (book.returnBook()) {
            System.out.println("'" + book.getTitle() + "'이(가) 반납되었습니다.");
        }

        /* 중복 반납 테스트 */
        if (!book.returnBook()) {
            System.out.println("'" + book.getTitle() + "'은(는) 대출 중이 아닙니다.");
        }
    }
}
