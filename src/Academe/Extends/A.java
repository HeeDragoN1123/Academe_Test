package Academe.Extends;

public class A {
    // static : 객체없이 사용가능
//    final 값을 못고침 대입이 안되고 처음에 값을 넣어어함
    public int num1 = 1;
    protected int num2 = 2;
    private int num3 = 3;


    public A() {
        System.out.println("A의 기본생성자");
    }
    public void test(){
        System.out.println("A의 메소드");
    }
    public int getNum3() {
        return num3;
    }

    @Override
    public String toString(){
        return "num1" + num1 + "num2" + num2 + "num3" + num3;
    }
}
