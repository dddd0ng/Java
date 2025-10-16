/*메서드 단축 */
var pika = {
    name: '피카츄',
    attack: function (skill) {
        console.log(`${this.name}가 ${skill}을(를) 사용합니다.`);
    }
};
pika.attack('백만볼트'); //피카츄가 백만볼트를 사용합니다.


//메서드 단축 구문
var pika2 = {
    name: '피카츄2',
    attack(skill) { //클론(:), function 키워드를 생략하고 메서드를 작성 할 수 있음
        console.log(`${this.name}가 ${skill}을(를) 사용합니다.`);
    }
};
pika.attack('백만볼트'); //피카츄가 백만볼트를 사용합니다.