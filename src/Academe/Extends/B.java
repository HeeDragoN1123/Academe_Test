package Academe.Extends;

public class B extends A {
    private int num4 = 4;
    public B(){
        super(); //디폴트값 없어도댐
        System.out.println("B의 기본생성자");
    }

    @Override
    public String toString(){
            return super.toString() + "num4" + num4;
//        return "num1" + num1 + "num2" + num2 + "num3" + getNum3() +"num4" + num4;
    }



}
