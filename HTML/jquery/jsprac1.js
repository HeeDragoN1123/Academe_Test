$('#toggleBtn').on('click', function () {
    $('#alertBox').toggleClass('show'); // show 클래스 토글 → fade + show 조합으로 트랜지션
});

// $('img')
//     .on('mouseenter', function () {
//         let width = $(this).width();
//         let height = $(this).height();
//         $(this).css({
//             width: width * 0.5 + 'px', // 20% 확대
//             height: height * 0.5 + 'px',
//         });
//     })
//     .on('mouseleave', function () {
//         $(this).css({
//             width: '', // 빈 문자열은 기본 스타일로 되돌림
//             height: '',
//         });
//     });

let x;

// $(this).val(); // 입력란의 입력 값 읽기
// $(this).val('변경내용'); // 입력란의 입력 값 변경

// if (x.key == 'Enter') {
//     // Enter 키가 눌렸을 때의 동작
//     console.log('Enter key pressed');
// }

$('#test').on('click', function () {
    let ar = [10, 20, 30, 40];
    ar.push(50); // 배열에 50 추가
    console.log(ar); // [10, 20, 30, 40, 50]

    let sum = 0; // 합계를 저장할 변수 초기화
    for (let i = 0; i < ar.length; i++) {
        sum += ar[i]; // 배열의 모든 요소를 더함
    }
    console.log(sum); // 배열의 합계 출력
}); // test 버튼 클릭 시 동작

const user = { name: '철수', age: 25 };

const jsonStr = JSON.stringify(user);

console.log(jsonStr); // {"name":"철수","age":25} // 객체를 JSON 문자열로 변환

// const jsonArrayStr = JSON.stringify(objectArray);
// console.log(jsonArrayStr); // [{"name":"철수","age":25},{"name":"영희","age":30},{"name":"민수","age":28}]

// console.log(JSON.parse(jsonStr)); // { name: '철수', age: 25 } // JSON 문자열을 객체로 변환
// console.log(JSON.parse(jsonArrayStr)); // [{ name: '철수', age: 25 }, { name: '영희', age: 30 }, { name: '민수', age: 28 }] // JSON 문자열을 객체 배열로 변환

// const parsedArray = JSON.parse(jsonArrayStr);
// console.log(parsedArray); // [{ name: '철수', age: 25 }, { name: '영희', age: 30 }, { name: '민수', age: 28 }]
// console.log(parsedArray[0].name); // 철수

$('#test2').on('click', function () {
    let objectArray = [
        { name: '철수', age: 25 },
        { name: '영희', age: 30 },
        { name: '민수', age: 28 },
    ];
    console.log(objectArray); // [{ name: '철수', age: 25 }, { name: '영희', age: 30 }, { name: '민수', age: 28 }]
    console.log(typeof objectArray); // object
    const jsonArrayStr = JSON.stringify(objectArray);
    console.log(jsonArrayStr); // [{"name":"철수","age":25},{"name":"영희","age":30},{"name":"민수","age":28}]
    console.log(JSON.parse(jsonArrayStr)); // [{ name: '철수', age: 25 }, { name: '영희', age: 30 }, { name: '민수', age: 28 }]

    const parsedArray = JSON.parse(jsonArrayStr);
    console.log(parsedArray[0].name);
});

$('#testTable').on('click', function () {
    let html = '<table>';
    // 테이블에 objectArray의 데이터를 추가
    let objectArray = [
        { name: '철수', age: 25 },
        { name: '영희', age: 30 },
        { name: '민수', age: 28 },
    ];

    $(objectArray).each(function (index, item) {
        html += `<tr>
                        <td>${item.name}</td>
                        <td>${item.age}</td>
                    </tr>`;
    });
    html += '</table>';
    $('#testTable').html(html); // testTable 요소에 테이블 HTML 삽입
    console.log(html); // 생성된 HTML 출력
});

// <main>
//     <h1>메인 페이지입니다</h1>
// </main>

// <button id="toggleBtn" class="btn btn-primary">토글 알림</button>

// <div id="alertBox" class="alert alert-success fade" role="alert">
// </div>

// <div id="img"><img
//         src="https://i.namu.wiki/i/95m3jB8Tgs0_3KEn84f3JcCBhUodsOvNfvnaatfSpEC8Ru6FajAx7q9NJLSOmmBgGoosDxUSNVuwmlN1GSjDMw.webp"
//         alt="" width="300px" height="300px">
// </div>

// <button id="test">test버튼</button>
// <button id="test2">test2버튼</button>

// <textarea name="comment" id=""></textarea>

// <button id="testTable">테이블 연습 버튼</button>
