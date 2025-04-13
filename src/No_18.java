public class No_18 {
    public static void main(String[] args) {

        int n1 = 1, n2 = 1; // 첫 번째와 두 번째 수
        int n3; // 다음 수 저장

        System.out.print(n1 + " " + n2 + " "); // 처음 두 수 출력

        // 3번째부터 10번째까지 계산
        for (int i = 3; i <= 10; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2; // 이전 값 업데이트
            n2 = n3;
        }
    }
}
