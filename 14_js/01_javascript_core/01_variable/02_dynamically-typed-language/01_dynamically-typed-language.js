var test;
console.log(typeof test);

test = 1;
console.log(typeof test);

test = "JavaScript";
console.log(typeof test);

test = true;
console.log(typeof test);

test = Symbol();
console.log(typeof test);

test = {}; // JSON Object
console.log(typeof test); //객체

test = []; // JSON Array
console.log(typeof test); //객체

test = function () { }; 
// 함수가 리터럴, 함수지향언어(함수를 추구하는 언어)
console.log(typeof test); //객체
