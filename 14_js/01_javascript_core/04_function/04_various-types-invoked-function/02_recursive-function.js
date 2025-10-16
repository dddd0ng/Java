function factorial(n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}

console.log(factorial(2)); // 2! = Output: 2
console.log(factorial(3)); // 3! = Output: 6
console.log(factorial(5)); // 5! = Output: 120
// 익명 즉시 실행 함수에서 재귀 호출
// 자바스크립트도 재귀함수가 사용 가능하며 탈출 조건에 유의해야함