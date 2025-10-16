const arr = [
    '홍길동',
    20,
    true,
    null,
    undefined,
    NaN,
    Infinity,
    [],
    {},
    function () { }
];

/* 자바의 배열보다는 ArrayList같은 컬렉션에 가깝다. */
console.log(arr);

/*
  writable: true면 값을 수정할 수 있다.
  enumerable: true면 값을 순회할 수 있다.
  configurable: ture면 값을 삭제할 수 있다.

  이 세 가지가 모두 true가 아닌 객체를 '유사배열'이라고 부른다.
*/
console.log(Object.getOwnPropertyDescriptors([1, 2, 3]));