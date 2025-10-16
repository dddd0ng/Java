var obj = {
    normal: 'normal value',
    '@ s p a c e @': 'space value', // 특수문자 포함(_, $) 프로퍼티명 가능, 대신 사용은 지양
    '': '', //빈 문자열도 가능, 대신 사용은 지양    
    0: 1, //숫자 프로퍼티명은 내부적으로 문자열로 반환됨('0')
    var: 'var', // 예약어(존재하는 키워드)도 가능, 대신 사용은 지양
    normal: 'new value' // 프로퍼티명이 중복되면 나중에 작성된것만 인정
};

obj['test'] = 'test value'; //동적 프로퍼티 추가
//없는 프로퍼티에 접근하면 에러가 뜨는게 아니라 추가가 됨
console.log(obj);
console.log(obj['@ s p a c e @']);
console.log(obj['normal']);
//[]를 사용하면 모든 프로퍼티 접근 가능