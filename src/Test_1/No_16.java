package Test_1;

import java.util.Scanner;

public class No_16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner 생성
        System.out.print("정수를 입력하세요: ");
        int a = scanner.nextInt();

        long factorial = 1; // 결과를 저장할 변수

        // 1부터 n까지 반복하며 곱셈
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }

        System.out.println(a + "! = " + factorial);
    }
}
