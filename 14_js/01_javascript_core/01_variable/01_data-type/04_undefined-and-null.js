// var undef = undefined; //대입할수도있긴하지만, 절대적으로 안씀
/*
var 키워드로 선언한 변수는 암묵적으로 undefined로 초기화 되어 있다.
변수를 선언한 이후 값을 할당하지 않은 변수는 undefined인데 개발자가 의도적으로
undefined를 변수에 할당하는 것은 본래 취지와 어긋나고 혼란을 야기하므로 지양한다.
(보통은 대신 null 삽입함)
*/
var undef;
console.log(undef);
console.log(typeof undef);
/* null : 변수에 값이 없음을 의도적으로 추후에 명시적으로 주어야 할 때 사용된다.*/
var nullVal = 'test';
nullVal = null;
console.log(nullVal);
console.log(typeof nullVal);