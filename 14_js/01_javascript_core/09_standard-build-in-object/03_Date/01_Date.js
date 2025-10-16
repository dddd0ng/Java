/*
  UTC(협정 세계시): 국제 표준시로 기술적 표기에 사용된다.
  GMT(그리니치 평균시): UTC와 소수점 단위 정도의 차이가 나는 그리니치 천문대 기준.(일상생활 X)
  KST(한국 표준시): UTC + 9시간
*/

/* 1. new Date() */
console.log(new Date(0));  // UTC상 1970년 1월 1일 0시 기준
console.log(Date());       // KST가 나옴

/*
  연, 월, 일, 시, 분, 초, 밀리초를 의미하는 숫자들을 원하는 만큼의 인수로 전달하면
  UTC 기준 Date 객체가 반환 됨(9시간 전)
*/
console.log(new Date(2025, (10 - 1)));    // 0 ~ 11이 월(month) 체계
console.log(new Date(2025, (10 - 1), 16, (11 + 9), 39, 0));