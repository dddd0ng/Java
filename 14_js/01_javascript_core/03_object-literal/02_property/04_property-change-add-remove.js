var dog = {
    name: '멍멍이',
};

dog.name = '뭉뭉이'; //프로퍼티 값 변경
console.log(dog.name); //뭉뭉이
console.log(dog); //{ name: '뭉뭉이' }

dog.age = 3; //프로퍼티 추가
console.log(dog); //{ name: '뭉뭉이', age: 3 }

delete dog.age; //프로퍼티 삭제
console.log(dog); //{ name: '뭉뭉이' }
console.log(dog.age); //undefined
