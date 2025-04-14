package Test_1;

import java.util.Scanner;

public class No_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;       // 근무 시간
        int b = 0;   // 급여

        System.out.print("근무 시간을 입력하세요: ");
        a = input.nextInt();

        if (a <= 50) {
            b = a * 10000;
        } else {
            b = 50 * 10000 + (a - 50) * 11000;
        }

        // 결과는 항상 출력
        System.out.println("근무 시간 : " + a);
        System.out.println("급여 : " + b);

    }
}
