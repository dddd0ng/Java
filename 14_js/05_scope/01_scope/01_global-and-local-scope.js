var x = 'global x';
var y = 'global y';

function outer() {
    var z = "outer's local z";
    console.log(x); // 'global x' (외부 스코프의 변수 참조)
    console.log(y); // 'global y' (외부 스코프의 변수 참조)
    console.log(z); // 'outer's local z' (자신의 지역 변수 참조)    

    function inner() {
        var x = "inner's local x";

        console.log('inner : ', x); // 'inner's local x' (자신의 지역 변수 참조)
        console.log('inner : ', y); // 'global y' (외부 스코프의 변수 참조)
        console.log('inner : ', z); // 'outer's local z' (외부 스코프의 변수 참조)
    }

    inner();
}
outer();
// inner(); // Error: inner is not defined
// 중첩 함수
// 자바스크립트는 함수 안에 함수를 정의할 수 있음
// 중첩 함수는 외부 함수에서만 호출 가능하며, 외부 함수가 호출될 때마다 새로 생성됨