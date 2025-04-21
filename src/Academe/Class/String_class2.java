package Academe.Class;

import java.util.Scanner;

public class String_class2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String id = null;
        System.out.print("입력 : ");
        id = input.next();
        char genderCode = id.charAt(7);
        int month = Integer.parseInt(id.substring(2, 4));
        int day = Integer.parseInt(id.substring(4, 6));
        int age =Integer.parseInt(id.substring(0, 2));

        //주민등록번호를 입력받는다 (987654  - 1234567)
        //나이와 성별 생일을 출력한다.
        // 주민등록 번호를 잘못 입력하면 오류메시지를 출력하고 프로그램 종료
        // "000000 - 0000000" 형식으로 입력받는다.
        // 입력받은 문자열 길이는 14글자여야한다.
        // 7번째 문자는 -이고 그외에는 숫자로 구성되어야 한다.
        // 월은 1~12 범위여야 한다.
        // 일은 1~31 범위여야 한다.


        if (id.length() != 14) {
            System.out.print("입력한 주민번호가 14글자가 아닙니다.");
            return;
        } else if (id.charAt(6) != '-') {
            System.out.print("7번째 글자가 -가 아닙니다.");
            return;
        } else if (genderCode != '1' && genderCode != '2' && genderCode != '3' && genderCode != '4') {
                System.out.print("8번째 글자(젠더코드) 가 1또는 2또는 3또는 4가 아닙니다.");
                return;
            } else if (month < 1 || month > 12) {
                System.out.print("주민등록번호가 1~12월이 아닙니다.");
                return;
            } else if (day < 1 || day > 31) {
                System.out.print("주민등록번호가 1~31일이 아닙니다.");
                return;
            }
        for (int i = 0; i < id.length(); i++) {
            if (i == 6) continue;
            char numTest = id.charAt(i);

            if (numTest < '0' || numTest > '9') {
                System.out.println("'-'를 제외한 나머지 입력값이 숫자가 아닙니다.");
                return;
            }
        }

        if(genderCode == '1' || '2')


        //주민번호
        //나이
        //성별
        //생일
        System.out.println("주민번호는: " +id);
        System.out.println("나이: " + age);



        }
}
