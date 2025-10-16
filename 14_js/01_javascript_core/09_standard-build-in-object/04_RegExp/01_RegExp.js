/* 정규 표현식 */
/* regex 생성 방법들(모두 동일) */
let regex = /j/i;  // 패턴: j, 플래그 옵션: i => case insensitive(대소문자 구분 없이)
regex = new RegExp('j', 'i');
regex = new RegExp(/j/, 'i');
regex = new RegExp(/j/i);

/* test 함수로 regex 적용 확인(유효성 검사(validation check)) */
let target = 'JavaScript';

console.log(regex.test(target));  // target 문자열이 regex 패턴에 맞으면 true(유효하다)
console.log(/j/i.test(target));