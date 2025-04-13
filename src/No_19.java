public class No_19 {
    public static void main(String[] args) {
        boolean[] isNotPrime = new boolean[101]; // 0~100까지
        int count = 0;

        isNotPrime[0] = true;
        isNotPrime[1] = true;

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i * i <= 100; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= 100; j += i) {
                    isNotPrime[j] = true; // 소수가 아닌 수는 true로 표시
                }
            }
        }

        // 소수 출력 (5개씩 줄바꿈)
        for (int i = 2; i <= 100; i++) {
            if (!isNotPrime[i]) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}