var dog = {
    name: '멍멍이',
    eat: function (food) {
        console.log(`${this.name}가 ${food}를 먹습니다.`);
    }
};

/* 1. 마침표 표기법(dot notation) */
console.log(dog.name); //멍멍이
dog.eat('사료'); //멍멍이가 사료를 먹습니다.

/* 2. 대괄호 표기법(squre braket notation) */
var obj = {
    under_key: 'under_key',    // 특수기호( _, $)는 알아서 인지가 됨,결론적으로 문자열로 바뀌니까
    'dash-key': 'dash-key', // - 하이픈은 특수기호로 인지 못함, 적어줘야함
    0: 1
}

//마침표 표기법은 한계가 있다.
console.log(obj.under_key); //under_key
// console.log(obj."dash-key"); //에러
// console.log(obj.0); //에러

console.log(obj['under_key']); //under_key
console.log(obj['dash-key']); //dash-key
console.log(obj['0']); //1
//숫자 프로퍼티명은 내부적으로 문자열로 변환됨
console.log(obj[0]); //1