
/* 스프레드 연산자, 전개문법 */
let arr = [10, 30, 20];
console.log(arr);
console.log(...arr);

/* 배열은 스프레드 연산자를 활요하면 각 요소들을 구분하여 인수들로 바뀐다. */
console.log(`가장 큰 값: ${Math.max(10, 30, 20)}`);
console.log(`가장 큰 값: ${Math.max(...arr)}`);

/* 배열을 결합(concat)해서 하나의 배열로 만듦 */
let arr1 = [10, 30, 20];
let arr2 = [100, 300, 200];

console.log([...arr1, ...arr2]);
console.log([10, ...arr1, -1, ...arr2]);