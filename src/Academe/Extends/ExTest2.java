package Academe.Extends;

import javax.imageio.IIOException;
import java.io.IOException;

public class ExTest2 {
    public static void main(String args[]){
        int ch;

        try{
            System.out.print("1문자 입력 :");
            ch= System.in.read();
            System.out.println("입력한 문자는" + (char)ch + "입니다");
        }catch(IOException ex){
            ex.printStackTrace();
//            System.out.println("오류");
        }




    }
}
