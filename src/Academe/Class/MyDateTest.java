package Academe.Class;

import java.util.Scanner;

public class MyDateTest {
    public static void main(String args[]){

        MyDate date1 = new MyDate();

//        date1.setYear(-2000);
//        date1.setMonth(11);
//        date1.setDay(11);
//        System.out.println(date1.getYear());
//        System.out.println(date1);


//        MyDate date2 =new MyDate(2000,12,1);
//        MyDate date3 =new MyDate(2001,11,10);
//        System.out.println(date2.isValid());
//        System.out.println(date2);

        Scanner input = new Scanner(System.in);
        int y ,m , d;
//        System.out.print("년입력 : ");
//        year = input.nextInt();
//        System.out.print("월입력 : ");
//        month = input.nextInt();
//        System.out.print("일입력 : ");
//        day = input.nextInt();

        MyDate date4 =new MyDate();
        System.out.println("생년월일을 입력하세요");
       while(true){
            System.out.print("년입력 : ");
            y = input.nextInt();
            System.out.print("월입력 : ");
            m = input.nextInt();
            System.out.print("일입력 : ");
            d = input.nextInt();

//            입력값을 date4에 먼저 설정!
           date4.setYear(y);
           date4.setMonth(m);
           date4.setDay(d);

//           MyDate date5 = new MyDate(y, m, d);

            if(date4.isValid()){
                break;
            }
           System.out.println("년월일이 잘못 입력되었습니다");
        }

       System.out.println(date4);


        //생년 월일 입력받아 mydate객체안에 담음
        // 잘못입력하면 다시 입력 받음
        // 정상이면 입력받은 생년 월일 화면에 출력하고 종료


    }
}
