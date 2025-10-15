/*
ES11(2020)에 도입된 연산자로 연산자의 좌항이 null또는 undefined인 경우
error대신 undefined를 반환하고 그렇지 않으면 우항의 프로퍼티 참조를 이어간다.
(.(dot notation)은 객체의 프로퍼티에 접근하는 접근 연산자)
*/

var obj = null;
obj = {
    'value2': 'abc'
};

var val = obj?.value2; //NPE 방지 코드
console.log(val);


var str = '';
var len = str?.length;
console.log(len);