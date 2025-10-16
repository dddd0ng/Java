/* 단순 비교 연산자(==, !=)를 쓰지 못해서 함수를 써야만 되는 경우 */
/* 유한한 값인가? */
console.log(global.isFinite(10));        // true
console.log(global.isFinite(Infinity));  // false

/* NaN인가? */
console.log(global.isNaN(NaN));  // true
console.log(global.isNaN(10));   // false

/*
  js에서 uri 경로 상에 한글이 포함된 값을 처리해야 할 경우라면 encoding 또는 decoding을 해 주어야 한다. 
  이 때 전역 객체에서 제공하는 메소드를 사용할 수 있다.

  URIComponent 방식
  알파벳: A-Z, a-z
  숫자: 0-9
  특수기호: - _ . ! ~ * ' ()
*/
const uriComp = 'name=홍길동&job=student';
const encComp = global.encodeURIComponent(uriComp);
console.log(encComp);

/* 프론트 쪽에서 URL로 넘어온 값이 한글이 깨지면 적용해 볼 것 */
const decodeComp = global.decodeURIComponent(encComp);
console.log(decodeComp);