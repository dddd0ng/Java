/* 객체 구조 분해 할당 */
let pants = {
    productName: '배기팬츠',
    color: '검은색',
    price: 30000,
    getInfo: function () {
        console.log(this.color, this.productName, '좋아!');
    }
};

// let productName = pants.productName;
// let color = pants.color;

/*
  배열 구조 분해 할당과 달리 프로퍼티 순서는 중요하지 않지만
  반드시 기존의 프로퍼티명과 일치해야 한다.
*/
let { color, productName, getInfo } = pants;  // 순서 안 지켜도 되고 필요한 것만 추출 가능
console.log('color:', color);
console.log('productName:', productName);

/* pants.을 안 써도 동일한 함수지만 this.을 활용할 때는 메소드와 일반함수의 차이가 발생할 수 있다. */
pants.getInfo();
getInfo();   // this가 적용된 메소드일 경우 변수에 담고나면(일반함수) this의 의미는 전역 객체

/* 객체 구조 분해 할당 시 변수명을 원하는 것으로 교체 가능(:(콜론) 활용) */
let { color: co, productName: pr, price: pr2 } = pants;
console.log(co, pr, pr2);