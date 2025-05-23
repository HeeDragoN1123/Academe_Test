// console.log('콘솔로그를 찍어봅니다');

// let name;

// name = '홍길동';
// console.log(name);

// let student;

// student = ['홍길동', '이순신', '강감찬'];
// console.log(student);

let classmates;
classmates = ['철수', '영희', '훈이'];

console.log(classmates[0]);
console.log(classmates[1]);
console.log(classmates[2]);

// 배열의 길이 구하기
// console.log(student.length);
console.log(classmates.length);

// 배열의 값 꺼내기
// console.log(student[0]);

// 배열 맨뒤에 값 추가
// student.push('강감찬');
// console.log(student);
classmates.push('맹구');
console.log(classmates);

// 배열 맨 마지막 값 삭제
// student.pop();
// console.log(student);
classmates.pop('맹구');
console.log(classmates);

// 배열 요소 정렬
// student.sort();
// console.log(student);

// 배열 데이터 확인
// student.includes('홍길동');
// console.log(student.includes('홍길동'));
console.log(classmates.includes('철수'));
console.log(classmates.includes('맹구'));

// 배열 2개 연결
// student.concat(['이순신', '강감찬']);
// console.log(student.concat(['이순신', '강감찬']));

// 배열을 문자로 만들기
// student.join();
// console.log(student.join(', '));

// 배열 분리
// student.split(',');
// console.log(student.split(', '));

// 배열에서 원하는 요소 뽑기
// student.filter((item) => {
//     return item === '홍길동';
// });
// console.log(
//     student.filter((item) => {
//         return item === '홍길동';
//     })
// );

// 배열의 모든 요소 변경
// student.map((item) => {
//     return item + '입니다.';
// });
// console.log(
//     student.map((item) => {
//         return item + '입니다.';
//     })
// );

// let developer;

// developer = ['사고력', '협업능력', '문제해결능럭', '창의력', '수학적 사고'];

// console.log(developer[0]);

// let dream;

// dream = ['프론트엔드 개발자', '백엔드 개발자', '풀스택 개발자'];
// let result;
// result = developer.concat(dream);
// console.log(result);
// console.log(developer);

// const email = 'codecamp@gmail.com';

// email.includes('@');

// // console.log(email.includes('@'));

// email.split('@');
// // console.log(email.split('@')[0]);
// // console.log(email.split('@')[1]);

// let userMail = email.split('@')[0];
// // console.log(userMail);

// let company = email.split('@')[1];
// // console.log(company);

// let maskingMail = [];

// maskingMail.push(userMail[0]);
// maskingMail.push(userMail[1]);
// maskingMail.push(userMail[2]);
// maskingMail.push(userMail[3]);
// // console.log(maskingMail);
// maskingMail.push('*');
// maskingMail.push('*');
// maskingMail.push('*');
// maskingMail.push('*');
// // console.log(maskingMail);
// maskingMail.join('') + '@' + company;
// // console.log(maskingMail.join('') + '@' + company);

// let result = maskingMail.join('') + '@' + company;

// console.log(result);
