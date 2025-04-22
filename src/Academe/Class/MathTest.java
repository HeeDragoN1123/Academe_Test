package Academe.Class;

public class MathTest {
    public static void main(String arg[]){

        int i;
        double d;

        i= Math.abs(-5);
        System.out.println(i);

        d = Math.abs(-5.5); // 절대값
        System.out.println(d);
        d= Math.round(-2.7); // 올림
        System.out.println(d);
        d= Math.ceil(-2.7); // 내림
        System.out.println(d);
        d= Math.floor(-2.7); // 반올림
        System.out.println(d);
        d=Math.pow(2, 16); //2의 16승
        System.out.println(d);
        d= Math.sqrt(9); // 루트
        System.out.println(d);
        d=Math.random(); // 랜덤
        System.out.println(d);




    }
}
