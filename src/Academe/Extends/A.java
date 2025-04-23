package Academe.Extends;

public class A {
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
