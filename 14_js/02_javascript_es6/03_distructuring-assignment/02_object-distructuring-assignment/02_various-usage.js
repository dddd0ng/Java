/* 다양한 사용법 */
let shirts = {
    productName: "베이직 셔츠"
};

let { productName: pr = '어떤 상품', color = '어떤 색상', price = 0 } = shirts;
console.log('pr:', pr);
console.log('color:', color);
console.log('price:', price);

/* rest */
let pants = {
    productName: '밀리터리팬츠',
    color: '국방색',
    price: 25000
};

/* 객체 구조분해 할당에서도 rest 문법을 통해 나머지 프로퍼티 값을 가지는 객체로 변수에 담아낼 수 있다. */
let { productName, ...rest } = pants;
console.log('productName:', productName);
console.log('rest:', rest);
console.log('color:', rest['color']);
console.log('price:', rest.price);