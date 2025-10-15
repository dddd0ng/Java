//함수 선언문 형태는 함수 호이스팅(hoisting)이 발생한다.
console.log(hello('홍길동')); //함수 선언문 형태로 정의된 함수 호출

function hello(name) { // function 키워드, 함수명, 매개변수(파라미터)
    //function 키워드 우측에 함수명을 작성해야 활용 가능(기명 함수)
    return `${name}님 안녕하세요!`;
}



// console.log(hi('강감찬')); //ReferenceError: Cannot access 'hi' before initialization
//함수 표현식 형태는 함수 호이스팅이 발생하지 않는다.(에러발생함)
var hi = function (name) { //익명 함수(함수명 없음)
    return `${name}님 안녕하세요!`;
};
console.log(hi('강감찬')); //강감찬님 안녕하세요!
//이런식으로 작성하면 에러발생안함

/* 함수 선언문은 런타임 이전 자바스크립트 엔진(node.js)에 의해 먼저 해석된다.(컴파일적인 요소)
따라서함수 선언문 이전에 함수를 참조 할 수 있으며, 호출 할 수도 있다.
함수 선언문이 코드의 선두로 끌어올려진 것처럼 동작하는 자바스크립트 고유의 특징을
'호이스팅'이라고 한다. */