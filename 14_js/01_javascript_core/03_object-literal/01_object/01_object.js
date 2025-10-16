/*
자바 스크립트는 프로토타입 기반의 객체지향(기반) 프로그래밍 언어로 원시 값을 제외한 나머지 값
(함수, 배열, 정규표현식 등)은 모두 객체이다. (프로토타입을 가지면 객체)
자바스크립트의 객체는 키와 값으로 구성된 프로퍼티(property)의 집합이다.
*/

//리터럴 객체 -> 변수에 대입되는 객체니까
var name = '홍씨';
var age = 10;
console.log(globalThis); //브라우저에선 window, 노드에선 global
console.log(this); //전역 공간에선 globalThis와 this가 같음
//리터럴 객체 -> 변수에 대입되는 객체니까
var student = {

    //속성 프로퍼티
    name: '유관순',
    age: 16,
    //객체 안에 없어도 함수를 만들 수 있음(함수지향언어라)
    //객체 안에 있는 함수를 메서드라 따로 부름
    //기능 프로퍼티(=메서드) 메서드 안에서 This는 자기자신을 가리킴, this빼먹지말기
    //메서드 안에는 this.를 반드시 써야함(안쓰면 전역변수(global객체의 property)가 나올 수 있음)
    getInfo: function () {
        return `${this.name}(은)는 ${this.age}세 입니다.`; //this는 메서드를 포함한 객체를 의미
    } //얘는 리터럴이 아니라 세미콜론 적으면 에러뜸
};

console.log('student : ', student); //{ name: '유관순', age: 16, getInfo: [Function: getInfo] }
console.log('이름 : ', student.name); //유관순
console.log('나이 : ', student.age); //16
console.log('정보 : ', student.getInfo()); //유관순(은)는 16세 입니다.
//메서드는 소괄호(())를 통해 실행도 가능
