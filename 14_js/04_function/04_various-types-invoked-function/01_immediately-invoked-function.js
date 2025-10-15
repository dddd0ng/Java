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