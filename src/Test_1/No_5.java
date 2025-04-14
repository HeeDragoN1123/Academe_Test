package Test_1;

public class No_5 {
    public static void main(String[] args) {

        // 위쪽 삼각형
        for (int i = 1; i <= 5; i++) {
            // 공백
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(); // 한줄 띄우기

        // 아래쪽 삼각형 
        for (int i = 5; i >= 1; i--) {
            // 공백
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
