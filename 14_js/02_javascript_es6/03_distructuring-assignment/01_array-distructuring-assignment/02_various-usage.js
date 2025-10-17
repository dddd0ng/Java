/* 다양한 사용법 */
/* 1. 배열 구조분해 할당 이후 객체의 프로퍼티에 추가하는 것도 가능 */
let user = {};
[user.firstName, user.lastName] = 'Gwansoon Yu'.split(' ');
console.log(user);

/* 2. rest 문법 */
/* rest 문법을 쓰면 배열의 이후 나머지 요소들을 다시 배열로 만들어 변수에 담을 수 있음 */
let [first, , second, ...rest] = ['양자리', '황소자리', '쌍둥이자리', '게자리', '사자자리', '처녀자리'];
console.log('first:', first);
console.log('second:', second);
console.log('rest:', rest);

/* 3. 변수 교환 */
let student = '유관순';
let teacher = '홍길동';

/* 변수 -> 배열 -> (구조 분해 할당으로) 변수 */
[student, teacher] = [teacher, student];
console.log(`학생: ${student}, 교사: ${teacher}`);

/* 기본 값을 설정하고 사용할 수도 있다. */
let [firstName2 = '아무개', lastName2 = '김'] = [];
console.log('firstName2:', firstName2)
console.log('lastName2:', lastName2)