
// 객체를 생성 할 용도의 함수 (this. 를 활용하고 이름의 첫 글자를 대문자로 함)더라도 
// new 연산자가 없으면 일반 함수와 동일함)
function Student(name, age) {
    this.name = name; // 일반 함수로 사용될 때의 this는 global 객체이며, 없는 속성이면 접근 시 추가됨
    this.age = age;
    this.getInfo = function () {
        return `${this.name}(은)는 ${this.age}세 입니다.`;
    }

    console.log('일반 함수일 때 this : ', this);

    return this.getInfo();
}


//new 연산자를 안 붙이고 일반 함수로 썼을 때는 반환형이 없는 함수일 뿐이다.(undefined 반환)
const student = Student('Hong', 20); // new 키워드 없이 호출
console.log(student);

/* 
생성자 함수가 일반 함수와 명확히 차이나도록(객체만 생성하도록)
 new 연산자 없이 호출되어도 객체 생성 가능하게 작성 가능(빌트 인 함수)
*/

function Dog(name, age) {
    if (!new.target) { //new 연산자 없이 호출되었을 때
        //new연산자를 안쓰고 함수를 호출하면 true가 되도록
        //(원래 new.target은 new 연산자를 써서 호출하면 true, 안쓰면 false)
        return new Dog(name, age); //재귀호출로 new 연산자를 붙여서 다시 호출
    }
    this.name = name;
    this.age = age;
}
const dog1 = Dog('뽀삐', 3); // new 연산자 없이 호출
console.log(dog); // Dog { name: '뽀삐', age: 3 }
//new 연산자 없이 호출해도 객체가 생성됨

const dog2 = new Dog('두부', 5);
console.log(dog2); // Dog { name: '두부', age: 5 }