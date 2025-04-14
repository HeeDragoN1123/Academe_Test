package Test_1;

public class No_19 {
    public static void main(String[] args) {
        boolean[] isNotPrime = new boolean[101]; // 0~100까지
        int count = 0;

        isNotPrime[0] = true;
        isNotPrime[1] = true;

        // 에라토스테네스의 체 알고리즘
        // 0 과 1은 소수가 아니므로 제외
        // 2부터 시작하여 2를 제외한 나머지 배수는 전부 소수가 아님
        // 3도 마찬가지
        // isNotPrime 에 2, 3 , 4, 5 .... 100
        // J 에서 2*2부터 100 이하까지 i가 1씩커지면서 4이상되는 2의 배수를 체에 거름
        // i 도 마찬가지고 쭉 거름
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
                // 줄바꿈
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}