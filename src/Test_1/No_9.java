package Test_1;

public class No_9 {
    public static void main(String[] args) {
        // 1번째 FOR 문에서 1단부터 3단까지 돌림
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println();                  
        }
            System.out.println(); //1~3단 과 4~6단 줄 띄우기

        // 2번째 FOR 문에서 4단부터 6단까지 돌림
        for (int i = 1; i <= 9; i++) {
            for (int j = 4; j <= 6; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
            System.out.println(); //4~6단 과 7~9단 줄 띄우기

        // 3번째 FOR 문에서 7단부터 9단까지 돌림
        for (int i = 1; i <= 9; i++) {
            for (int j = 7; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
            System.out.println();
    }
}
