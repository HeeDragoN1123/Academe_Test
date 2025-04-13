public class No_4 {
    public static void main(String[] args) {

        // 위쪽 삼각형
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(); // 한줄 띄우기
        
        // 아래쪽 삼각형
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}