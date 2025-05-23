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

// 조건물 실습 1

if (1 + 1 === 2) {
    console.log("참");
} else {
    console.log("거짓");
}

if (true) {
    console.log("참");
} else {
    console.log("거짓");
}

if (!true) {
    console.log("참");
} else {
    console.log("거짓");
}

if (0) {
    console.log("참");
} else {
    console.log("거짓");
}

// 조건물 실습 2

const profile = {
    name: "철수",
    age: 12,
    school: "다람쥐초등학교",
};

if (profile.age >= 20) {
    console.log("성인입니다.");
} else if (profile.age >= 8) {
    console.log("학생입니다.");
} else if (profile.age >= 0) {
    console.log("어린이입니다.");
} else {
    console.log("잘못 입력하셨습니다.");
}
