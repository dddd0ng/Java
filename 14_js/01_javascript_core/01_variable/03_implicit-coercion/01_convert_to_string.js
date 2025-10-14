console.log(10 + '20');                // 1020
console.log(`10+20 : ${10 + 20}`);     // 10+20 : 30

console.log(1 + '');
console.log(NaN + '');
console.log(Infinity + '');
console.log(true + '');
console.log(null + '');
console.log(undefined + '');
// console.log(Symbol() + ''); // TypeError
console.log({} + '');
console.log([1, 2] + '');
console.log(function () { } + '');
