var message;

//매개변수가 없는 경우
message = function () {
    return "Hello, World!";
};
console.log(message());



message = () => {
    return "Arrow Function";
}
console.log(message());

//중괄호 생략 : 함수 내부 실행 구문이 하나만 있는 경우
//return 생략 : 하나의 값 또는 하나의 값으로 취급 할 수 있는 표현식 일 경우 암묵적으로 return됨
//소괄호 생략 : 매개변수가 하나일 경우만 생략 가능
message = () => "Arrow Function2";
console.log(message());


message = () => 1 + 2;
console.log(message());


//매개변수가 1개인 경우
message = function (name) {
    return `Hello, ${name}!`;
};
console.log(message('Hong'));

message = (name) => `Hello, ${name}!`;
console.log(message('Hong'));


//매개변수가 2개 이상인 경우
message = (val1, val2) => "Arrow" + val1 + val2;
console.log(message('Function3', '!'));
//프론트 개발자들은 보통 한줄짜리 코드를 많이씀(함수 간단한걸 선호)


message = val => "Arrow" + val;
console.log(message('Function4!'));