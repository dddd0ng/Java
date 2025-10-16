// null 병합 연산자
/* 좌항의 피연산자가 null이거나 undefined라면 
우항의 결과가 남고(함수면 실행),
그렇지 않으면 좌항이 남는다(함수만 실행) 
*/

var test = null ?? "기본 값";
console.log('test : ', test); // console.log에 두 개의 인수를 주면 중간에 띄어쓰기를 포함해 이어붙여줌

var value1 = '' || "기본 값1"; // ||(OR) 연산자는 좌항이 false여도 좌항이 남음     //의미 O
var value2 = '' ?? "기본 값2"; // ?? 연산자는 좌항이 null이나 undefined여야 우항이 남음 //의미 X (좌항이null이나  undefined가 아니니까 
console.log('value1 : ', value1);
console.log('value2 : ', value2);