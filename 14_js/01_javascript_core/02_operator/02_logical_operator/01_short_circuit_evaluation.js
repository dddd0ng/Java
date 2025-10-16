/* 단축 평가 구문 */
//논리 연산의 결과를 결정지을 항만 남는다.
/* 1. OR의 경우 */
//앞의 값만 나옴(좌측이 false여야 우측이 실행)
console.log('apple' || 'banana');
console.log('' || 'banana');
console.log('apple' || false);

/* 2. AND의 경우 */
//끝까지보고 끝의 값이 나오고(앞에 값이 true여야), 앞에값이 false면 그냥 false
console.log('apple' && 'banana');
console.log('' && 'banana');
console.log('apple' && false);

/* 3. 단축 평가 구문 */
var num = 2;
num % 2 == 0 && console.log('짝수입니다.'); //앞쪽 값이 true여야 뒤에값을 봄
num % 2 == 0 || console.log('홀수입니다.');
// && (AND) 일 때는 좌촉이 true여야 우측이 실행
// || (OR) 일 때는 좌촉이 false여야 우측이 실행

//아래 방식도 쓸 수 있긴한데 프론트는 위에 방식을 많이 씀
// if (num % 2 == 0) {
//     console.log('짝수입니다.');
// } else {
//     console.log('홀수입니다.');
// }