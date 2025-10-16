
//콜백함수 : 다른함수의 인수로 쓰이는 함수
function increase(value) {
    return value + 1;
}

function decrease(value) {
    return value - 1;
}

//고차 함수 : 다른 함수를 활용하는 함수
function apply(func, value) {
    return func(value);
}

//필요함수에 따라 콜백함수를 정해 고차함수를 호출 할 수 있다.
console.log(apply(increase, 5)); // Output: 6
// 콜백 함수(callback function)
// 함수의 매개변수로 함수를 전달받아 내부에서 실행하는 형태
// 자바스크립트에서 함수는 일급 객체이므로 가능
console.log(apply(decrease, 5)); // Output: 4

//js는 sort메서드가 들어가있음
console.log([3, 2, 1, 5, 4].sort(function (left, right) { return right - left; }));
console.log([3, 2, 1, 5, 4].sort((left, right) => right - left)); //화살표함수

/* 비동기 처리(이벤트, 타이머, ajax, fetch, ...) */