import java.util.Scanner;

public class No_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //문제 스캐너로 키(cm)와 몸무게kg을 입력받는다.
        //bmi지수를 구하여 비만,과체중,정상,저체중으로 판정하여 출력한다.

        // 키 ,  몸무게는 정수이기 때문에  int값으로 변수를 지정
        int height,weight;

        // BMI 지수는  몸무게 / 키(m) *키(m) 를 나타내는 소수점으로 내려가는 수치 이기 때문에 double 로 받음
        double BMI;

        // 스캐너 로 키와 몸무게를 입력 받음
        System.out.print("키 = ");
        height = input.nextInt();
        System.out.print("몸무게 = ");
        weight = input.nextInt();

        //BMI 계산  100.0을 넣거나 foalt 를 뜻하는 f를 100 뒤에다가 넣어야 에러가 나지 않는다.
        // 만약 100으로 실행을 한다면 뒤에 소수점이 나오지 않을것이다.
        double heightM = height / 100.f;
        BMI = weight / (heightM * heightM);


        // BMI판정
        if (BMI >=25) {
            System.out.println("키(cm) : " + height +"\n" +  "몸무게(Kg) :" + weight +"\n" + BMI + "(비만)");

        } else if (25.0 > BMI && BMI >= 23) {
            System.out.println("키(cm) : " + height +"\n" +  "몸무게(Kg) :" + weight +"\n" + BMI + "(과체중)");
        } else if (23 > BMI && BMI >= 18.5) {
            System.out.println("키(cm) : " + height +"\n" +  "몸무게(Kg) :" + weight +"\n" + BMI + "(정상)");
        } else {
            System.out.println("키(cm) : " + height +"\n" +  "몸무게(Kg) :" + weight +"\n" + BMI + "(저체중)");
        }

    }
}
