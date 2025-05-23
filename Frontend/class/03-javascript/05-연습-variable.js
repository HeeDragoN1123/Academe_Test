// 데이터 타입, 연산자 실습

// console.log(1 + 1);
// console.log(1 + "1");
// console.log(1 - "1");
// console.log("123" == 123);
// console.log("123" === 123);
// console.log(true && true);
// console.log(true || false);
// console.log(true && false);

var a = 1;
var b = "2.1";
var c = "abc";

// console.log(parseInt(b));
// console.log(parseFloat(b));
// console.log(typeof parseFloat(b));
//Not a Number
// 숫자로 변환할수 없는가? 맞으면 true , 아니거나 모르겠으면 false
console.log(isNaN(a)); // false
console.log(isNaN(b)); // false
console.log(isNaN(c)); // true
console.log(isNaN(null)); // false
console.log(isNaN("")); // false
console.log(isNaN(undefined)); // true
