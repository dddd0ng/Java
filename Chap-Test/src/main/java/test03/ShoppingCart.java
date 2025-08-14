package test03;

public class ShoppingCart {
    private String[] items;         // 상품들
    private int[] prices;           // 각 상품 단가
    private int itemCount;          // 각 상품 구분 번호
    private static final int MAX_ITEMS = 10;

    public ShoppingCart() {
        items = new String[MAX_ITEMS];
        prices = new int[MAX_ITEMS];
    }

    /**
     * 문제 8: 쇼핑카트 관리하기
     *
     * 쇼핑카트에 상품을 추가하고 총 금액을 계산하는 프로그램을 작성하시오.
     * 카트에는 최대 10개의 상품을 담을 수 있다.
     *
     * 예상 흐름:
     * 카트에 한번에 하나의 상품씩 추가(addItem) 한다.
     * 이 때 상품명과 상품의 단가가 같이 전달 된다.
     *
     * 예상 출력:
     * [쇼핑카트 관리]
     * 상품 추가: 사과 (1000원)
     * 상품 추가: 바나나 (2000원)
     * 상품 추가: 오렌지 (1500원)
     *
     * 장바구니 목록:
     * 1. 사과 (1000원)
     * 2. 바나나 (2000원)
     * 3. 오렌지 (1500원)
     * 총 금액: 4500원
     *
     * @param item 상품명
     * @param price 가격
     * @return 추가 성공 시 true, 실패 시 false
     */
    public boolean addItem(String item, int price) {

        // 여기에 코드 작성(return 구문도 수정 필요하면 수정)
        return false;
    }

    public void printCart() {

        // 여기에 코드 작성
    }

    public int calculateTotal() {

        // 여기에 코드 작성(return 구문도 수정 필요하면 수정)
        return 0;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        System.out.println("[쇼핑카트 관리]");

        /* 상품 추가 테스트 */
        String[] items = {"사과", "바나나", "오렌지"};
        int[] prices = {1000, 2000, 1500};

        for (int i = 0; i < items.length; i++) {
            if (cart.addItem(items[i], prices[i])) {
                System.out.println("상품 추가: " + items[i] + " (" + prices[i] + "원)");
            }
        }

        System.out.println("\n장바구니 목록:");
        cart.printCart();
        System.out.println("총 금액 " + cart.calculateTotal() + "원");
    }
}
