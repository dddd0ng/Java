//숫자1, 문자'1', true 비교
console.log(`1==1 : ${1 == 1}`);
console.log(`1==true : ${1 == true}`);
console.log(`1=='1' : ${1 == '1'}`); // 동등비교
console.log(`1==='1' : ${1 === '1'}`); // 동일비교 ( 타입까지 포함해서)


// NaN는 유일하게 자기 자신과 동등/동일 비교가 안됨
console.log(`NaN == NaN : ${NaN == NaN}`);
console.log(`NaN === NaN : ${NaN === NaN}`);

// 일치하지 않는 값 비교
console.log(`1!='1' : ${1 != '1'}`); // false
console.log(`1!=='1' : ${1 !== '1'}`); // true
