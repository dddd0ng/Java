//반환이 있는 경우 : 반환 이후 코드는 동작하지 않음
function hello(name) {
    return `${name}님 안녕하세요!`;
    console.log('return문 이후');
}
console.log(hello('홍길동'));

//반환이 없는 경우 : 함수 블록 내의 모든 코드가 동작함, 반환값은 undefined
function hello2(name) {
    console.log('함수가 호출됨');
}
console.log(hello2('유관순')); //함수가 호출됨 // undefined