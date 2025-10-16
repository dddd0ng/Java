var sym = Symbol("심볼");

var student = {
    name: '유관순',
    age: 16,
    test: undefined
};

student[sym] = '추가';
console.log(student); //{ name: '유관순', age: 16, test: undefined, [Symbol(심볼)]: '추가' }


//해당 객체에 해당 프로퍼티 키 값이 있는지 확인해서 boolean으로 반환
console.log('name' in student); //true
console.log('age' in student); //true
console.log('test' in student); //true
console.log('grade' in student); //false
console.log(sym in student); //true

//for in문으로 객체 순회(객체가 가진 프로퍼티 키 값들을 순회하며 변수에 담아서 반복)
for (var key in student) {
    // console.log(`key : ${key}, value : ${student[key]}`);
    //key : name, value : 유관순
    //key : age, value : 16
    //key : test, value : undefined
    //심볼은 for in문에 안나옴


    console.log(`<td>${student[key]}</td>`);
    //<td>유관순</td>
    //<td>16</td>
    //<td>undefined</td>
}
