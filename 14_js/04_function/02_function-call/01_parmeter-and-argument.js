//parameter(매개변수), argument(인수또는 인자)
function hello(name) { //name이 매개변수(parameter)
    console.log('넘어 온 값 : ', name);
    console.log('arguments : ', arguments);
    /*
    모든 함수는 반드시 arguments라는 유사배열(배열같은 객체(인덱스 같은 프로퍼티와 length라는 프로퍼티를 가짐))
    모든 인수(전달인자)는 함수 안에서 arguments 객체의 프로퍼티로 보관된다.(객체로 참조할 수 있다.)
    */
    console.log('arguments[0] : ', arguments[0]);
    console.log('arguments[1] : ', arguments[1]);
    //인덱스처럼 쓰라 하는거지 인덱스는 아님, 배열과 동일하게 수정은 불가능
    return `${name}님 안녕하세요!`;
}

// hello('홍길동'); //'홍길동'이 인수(argument, 인자)
// console.log('result : ', hello('홍길동'));
//return이 없으면 함수의 결과는 undefined
//함수는 return문을 만나면 함수 실행을 종료하고, return 우측의 값을 함수 호출부로 반환한다.
//return문이 없으면 함수는 암묵적으로 undefined를 반환한다.

// console.log('result : ', hello()); //undefined님 안녕하세요!
//매개변수에 대응되는 인수가 없으면 매개변수는 undefined로 초기화된다.
//따라서 name은 undefined가 되고, 결과적으로 'undefined님 안녕하세요!'가 된다.

var result = hello('홍길동', '유관순');
console.log('result : ', result); //홍길동님 안녕하세요!
//매개변수에 대응되는 인수가 여러개라도 첫번째 인수만 매개변수에 할당된다.
//나머지 인수는 무시된다.