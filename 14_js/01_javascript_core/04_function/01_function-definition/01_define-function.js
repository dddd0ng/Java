/* 1. 함수 선언문 형태 */
function hello(name) { // function 키워드, 함수명, 매개변수(파라미터)
    //function 키워드 우측에 함수명을 작성해야 활용 가능(기명 함수)
    return `${name}님 안녕하세요!`;
}
console.log(hello('홍길동')); //홍길동님 안녕하세요!

/* 2. 함수 표현식 형태 */
/*
자바스크립트의 함수는 객체 타입의 값으로 값의 성질을 가지는 객체로써 일급객체라고 한다.
따라서 함수 리터럴로 생성한 함수는 변수에 할당 할 수 있다.
*/
var hello2 = function (name) { //익명 함수(함수명 없음)
    return `${name}님 안녕하세요!`;
};
console.log(hello2('강감찬')); //강감찬님 안녕하세요!