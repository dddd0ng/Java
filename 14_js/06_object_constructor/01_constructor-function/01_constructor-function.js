//생성자 함수는 자바의 클래스와 생성자를 혼용한 느낌이다.

function Student(name, age) {
    this.name = name;
    this.age = age;
    this.getInfo = function () {
        return `${this.name}(은)는 ${this.age}세 입니다.`;
    }
}

// new 키워드와 함께 함수를 호출하면 객체가 생성됨
const student1 = new Student('Hong', 20);
const student2 = new Student('Kim', 22);

console.log('student1:', student1);
console.log('student2:', student2);

//리터럴 객체를 활용한 객체 생성
const student3 = {
    name: '장보고',
    age: 25,
    getInfo: function () {
        return `${this.name}(은)는 ${this.age}세 입니다.`;
    }
};

//
const student4 = {
    name: '신사임당',
    age: 25,
    getInfo: function () {
        return `${this.name}(은)는 ${this.age}세 입니다.`;
    }
};
console.log('student3:', student3);
console.log('student4:', student4);