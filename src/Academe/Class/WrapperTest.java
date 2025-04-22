package Academe.Class;

import java.util.Random;

public class WrapperTest {
    public static void main(String arg[]){
        Integer a = new Integer(100);

        Integer i   = Integer.parseInt("12345");
        String s = Integer.toString(100);
        Random r = new Random();

        System.out.println( i + s);
        System.out.println(r.nextDouble(10.0));

    }
}
