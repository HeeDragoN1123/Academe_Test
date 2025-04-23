package Academe.Extends;


import javax.swing.*;
import java.awt.*;

public class MyWindowTest {
    public static void main(String args[]) {

        MyWindow w = new MyWindow();
//        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        w.setBounds(200,300,400,500);
//        w.setVisible(true);

//        System.out.println(w instanceof MyWindow);
//        System.out.println(w instanceof JFrame);
//        System.out.println(w instanceof Container);

        Container c = new MyWindow();

//        System.out.println(c instanceof MyWindow);
//        System.out.println(c instanceof JFrame);
//        System.out.println(c instanceof Container);

//        MyWindow win = c; // c는 컨테이너 타입으로 더 상위 타입이라서 안됨
//         Container win2 = w;
//        MyWindow win = (MyWindow) c; //실행중 에러가 남

        MyWindow window = new MyWindow("창열기 연습");

        window.setBounds(200,200,200,200);
        window.setVisible(true);



    }
}