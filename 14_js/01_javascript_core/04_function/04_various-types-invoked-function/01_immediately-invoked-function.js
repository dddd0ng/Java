function hello(name) {
    return `${name} hello!`;
}

// function () {
//     console.log('익명 즉시 실행 함수 !');
// }  이 상태에선 안뜨고 전체적으로 감싸주면서 마지막에 소괄호 써줘야함

(function () {
    console.log('익명 즉시 실행 함수 ! 함수 정의와 동시에 자동 호출');
}());

(function (name) {
    console.log(`${name} hello!`);
}('Hong'));

// 매개변수 있는 함수에 인수를 전달 할 수는 있지만, 기명함수로 만들어도 외부에서 호출은 X
// (function greeting(name) {
//     console.log(`${name} hello!`);
// }('Hong'));

// greeting('Kim'); // error, greeting is not defined