import java.util.Scanner;

public class No_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0; // 3의 배수 개수 저장

        // 10번 반복 입력 받기
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 정수: ");
            int num = scanner.nextInt();

            // 3의 배수인지 확인
            if (num % 3 == 0) {
                count++;
            }
        }

        System.out.println("3의 배수의 개수 :" + count );
        scanner.close();
    }
}
