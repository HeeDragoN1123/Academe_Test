import java.util.Scanner;

public class No_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 170;
        int b = 70;
        System.out.println((double)b / 2.8899999999999997);
        System.out.print("키 = ");
        int height = input.nextInt();
        System.out.print("몸무게 = ");
        int weight = input.nextInt();
        System.out.print("BMI = ");
        double BMI = input.nextDouble();
        System.out.println("키(cm) : " + height + "  몸무게(Kg) :" + weight);
        if (BMI >= (double)25.0F) {
            System.out.println("비만입니다.");
        } else if ((double)25.0F > BMI && BMI >= (double)23.0F) {
            System.out.println("과체중입니다.");
        } else if ((double)23.0F > BMI && BMI >= (double)18.5F) {
            System.out.println("정상입니다.");
        } else {
            System.out.println("저체중입니다.");
        }

    }
}
