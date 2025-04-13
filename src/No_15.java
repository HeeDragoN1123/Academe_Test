
public class No_15 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        while (true) {
            ++n;
            sum += n;
            if (sum > 4000) break;
        }
        System.out.println("1 ~ " + n + "까지의 합계 : " + sum);
    }
}