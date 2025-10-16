const now = Date.now();      // 1970년 1월 1일 이후 현재시간까지 milli seconds 반환
console.log(new Date(now));

const date = new Date();

console.log(Object.getOwnPropertyDescriptors(date));
console.log(date.getFullYear());
console.log(date.getMonth() + 1);
console.log(date.getDate());
console.log(date.getDay());              // 0 ~ 6(0: 일요일, 1: 월요일, ...)
console.log(date.getHours());
console.log(date.getMinutes());
console.log(date.getSeconds());
console.log(date.getMilliseconds());

/* 내가 원하는 시간의 요일을 알 수 있음 */
date.setFullYear(2025);
date.setMonth(4 - 1);
date.setDate(2);
date.setHours(12);
date.setMinutes(33);
date.setSeconds(10);
console.log(date);
console.log(date.getDay());