// function arrayTest() {
//     let ar1 = [1, 2, 3, 4, 5];
//     let ar2 = [];
//     let ar3 = new Array();
//     let ar4 = new Array(5);

//     console.log(`ar1: ${ar1}, ar2: ${ar2.length}, ar3: ${ar3.length}, ar4: ${ar4.length}`);

//     ar1[0] = 10;
//     ar1[4] = 9;
//     ar1.push(6);
//     ar1.pop();
//     ar1.splice(1, 2, 20, 30);
//     console.log(`ar1: ${ar1}`);
//     console.log(ar1.indexOf(30));
//     console.log(ar1.sort());
// }

// arrayTest();

function date() {
    let now = new Date();
    console.log(
        `현재 시간: now.getFullYear(): ${now.getFullYear()}, now.getMonth(): ${
            now.getMonth() + 1
        }, now.getDate(): ${now.getDate()}, now.getHours(): ${now.getHours()}, now.getMinutes(): ${now.getMinutes()}, now.getSeconds(): ${now.getSeconds()}`
    );
}
date();
