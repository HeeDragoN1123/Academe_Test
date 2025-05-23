const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

// rl.question("점수를 입력하세요: ", function (n) {
//     n = Number(n);

//     if (n >= 80) {
//         console.log("합격입니다.");
//     } else {
//         console.log("불합격입니다.");
//     }

//     rl.close();
// });

rl.question("점수를 입력하세요 : ", function (n) {
    n = Number(n);
    if (isNaN(n)) {
        console.log("숫자가 아닙니다.");
        rl.close();
        return;
    }
    if (n < 0 || n > 100) {
        console.log("점수는 0~100 사이여야 합니다.");
        rl.close();
        return;
    }

    if (n >= 90) {
        console.log("A");
    } else if (n >= 80) {
        console.log("B");
    } else if (n >= 70) {
        console.log("C");
    } else if (n >= 60) {
        console.log("D");
    } else {
        console.log("F");
    }
    rl.close();
});
