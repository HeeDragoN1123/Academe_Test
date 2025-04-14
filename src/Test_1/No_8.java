package Test_1;

public class No_8 {
    public static void main(String[] args){

        //변수 지정
        int a,b;

        // 반복문으로 a 1 에서 9까지 돌림
        // a가 1번 돌아갈때마다 b가 1에서 9까지 돌아가며 곱셈을 하게됨
        for(a =1; a <=9; a++){
            for(b = 1; b<=9; b++){

                System.out.print(a +"*" + b  +"=" + a*b + "\t");
            }
            System.out.println();
        }

    }
}
