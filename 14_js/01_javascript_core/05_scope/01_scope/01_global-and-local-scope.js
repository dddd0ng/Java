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



console.log(z); // Error: z is not defined (z는 outer 함수의 지역 변수이므로 외부에서 참조 불가)
//전역에서는 outer나 inner같은 지역 변수는 활용 할 수 없음

/*
스코프 체인

inner 스코프 -> outer 스코프 -> 전역(global) 스코프 순으로 우선순위가 결정된다.
모든 스코프는 하나의 계층적 구조로 연결되며 자바스크립트 엔진은 스코프 체인을 통해
변수를 참조하며 코드의 상위 스코프 방향으로 올라가며 변수를 검색한다.
(하위 스코프에서 유효한 변수를 상위 스코프에서는 참조 할 수 없다.)
*/