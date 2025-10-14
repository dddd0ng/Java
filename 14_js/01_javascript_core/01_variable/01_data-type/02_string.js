var hello = 'hello world!';
console.log(hello);

/* 
Template Literal (템플릿 리터럴) 
멀티라인(다중 행), 변수삽입, 표현식 모두 템플릿 리터럴이라고 한다.
하나의 리터럴이 되게 하는 식 => 표현식 (1+1을 하던, 복잡한 식이 되던)
*/
var str = `안녕하세요.
반갑습니다.`;
console.log("Multiline: " + str);

var lastName = "길동";
var firstName = "홍";
console.log('제 이름은 : ' + lastName + ' ' + firstName + '입니다');
//백틱 사용해서 표현하는게 쉽고 깔끔하고 좋음
console.log(`제 이름은 ${lastName} ${firstName} ${1 + 2}세 입니다.`)