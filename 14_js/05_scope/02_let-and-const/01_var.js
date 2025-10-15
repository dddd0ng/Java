

//함수 레벨 스코프
/*
C, 자바 등 대부분의 프로그래밍 언어는 모든 코드 블럭(if, for, while, try/catch 등)이
지역 스코프를 만드는 블록 레벨 스코프(block-level scope)를 가짐
하지만 var키워드로 선언된 변수는 함수의 코드블록(함수 몸체)만을 지역 스코프로 인정하는
함수 레벨 스코프를 가짐
*/
var i = 0;
for (var i = 0; i < 10; i++) {
}

console.log(i); // 10
// var 키워드는 함수 레벨 스코프를 가짐
// 블록 레벨 스코프를 가지지 않음
// 따라서 for문에서 선언한 i 변수는 for문 밖에서도 접근 가능
// 의도치 않게 변수 값이 변경될 수 있으므로 주의 필요

//var 키워드의 특징
// 1. 같은 범위 (전역 또는 같은 함수 레벨 스코프)에서 변수 중복 선언 가능
var msg = 'hello';
console.log('msg =', msg); // hello

var msg = 'byebye'; // 재선언 가능
console.log('msg =', msg); // byebye

var msg; // 변수가 초기화 되지 않고 중복 선언된 경우는 무시됨(불규칙)
console.log('msg =', msg); // byebye
// 2. 함수 레벨 스코프만 인정 됨

// 3. 변수 호이스팅
console.log(test); // undefined


test = 'welcome'; // 대입이 안된 상태로 호이스팅 됨
var test;
// var 키워드로 선언된 변수는 변수 호이스팅(hoisting)이 발생함
// 변수 호이스팅 : 변수 선언문이 스코프의 선두로 끌어 올려진 것처럼 동작하는 현상
// 따라서 변수를 선언하기 전에 참조할 수 있음
// 단, 변수 선언문 이전에 변수를 참조하면 undefined가 반환됨(변수는 호이스팅 되지만, 할당문은 호이스팅 되지 않음)
// 이는 의도치 않은 결과를 초래할 수 있으므로 주의 필요