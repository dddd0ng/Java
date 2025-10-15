/* 프로퍼티 값 단축(변수로 리터럴 객체 쉽게 만들기) */

var id = 'p-0001';
var price = 30000;

var product = {
    id: id,
    price: price
};
console.log('product : ', product);


//변수명이 프로퍼티 키, 변수값이 프로퍼티 값이 된다.
var product2 = { id, price }; //ES6 프로퍼티 값 단축
console.log('product2 : ', product2);
//프로퍼티 값 단축은 프로퍼티명과 변수명이 동일할 때만 사용 가능