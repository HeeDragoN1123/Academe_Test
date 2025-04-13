import java.util.Scanner;

public class No_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("연산자 (+,-,*,/) : ");
        String op = input.next();

        // 유효한 연산자인지 먼저 if문으로 검사
        // 이퀄 안쓰면 문자열 검사가 되지 않음
        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
            System.out.print("첫번째 정수 : ");
            int num1 = input.nextInt();

            System.out.print("두번째 정수 : ");
            int num2 = input.nextInt();

            // 나눗셈의 경우 0 나누기 검사
            if (op.equals("/") && num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                int result = 0;

            //switch 문으로 case 만들어서 result 값 도출
                switch (op) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }

                System.out.println(num1 + op + num2 + " = " + result);
            }
        } else {
            System.out.println("연산자를 잘못 입력했습니다.");
        }


        }

    }

