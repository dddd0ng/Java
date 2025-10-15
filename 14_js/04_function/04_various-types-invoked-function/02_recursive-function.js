function factorial(n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}

console.log(factorial(2)); // 2! = Output: 2
console.log(factorial(3)); // 3! = Output: 6
console.log(factorial(5)); // 5! = Output: 120

// 익명 즉시 실행 함수에서 재귀 호출