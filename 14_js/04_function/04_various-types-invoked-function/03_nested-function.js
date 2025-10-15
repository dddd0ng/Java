function outer() {
    var outerVar = "외부함수";

    function inner() {
        var innerVal = "내부함수";
    }
    inner(); // Call the inner function
}
// inner(); // Error: inner is not defined
outer(); // Call the outer function
// 중첩 함수
// 자바스크립트는 함수 안에 함수를 정의할 수 있음
// 중첩 함수는 외부 함수에서만 호출 가능하며, 외부 함수가 호출될 때마다 새로 생성됨