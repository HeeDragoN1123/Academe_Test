package Academe.Class;

import java.util.Calendar;
import java.util.Scanner;

public class String_class1 {
        public static void main(String args[]){
            //문자열을 입력받아 마지막 글자부터 거꾸로 출력한다.

            Scanner input = new Scanner(System.in);

//            System.out.print("입력 : ");
//            String str = input.next();


//             for(int i = str.length()-1; i>= 0; i-- ){
//                 System.out.print(str.charAt(i)); // n번쨰문자
//             }
//             System.out.println();
//
//             StringBuffer sb = new StringBuffer(str); // 스트링 버퍼는 원본이 바뀜
//
//             System.out.println(sb.reverse());
//            System.out.println(sb); // qwerzxcv 이어야하지만 / vcxzrewq가 됨


            System.out.println(1 +1);
            System.out.println('1' + '1');
            System.out.println("1" + "1");

            String s = "123";
            System.out.println("123" + 1);

//            int m = Integer.parseInt(s); // String 형태의 숫자를 int로 변환
//            System.out.println(m +1);

            //현재 시간정보 알아내기
            Calendar c = Calendar.getInstance();
            int y= c.get(Calendar.YEAR); //년
            int m= c.get(Calendar.MONDAY); //월 0~11 까지
            int d= c.get(Calendar.DATE); //일
            int e= c.get(Calendar.HOUR); //시
            int f= c.get(Calendar.MINUTE); //분
            int g= c.get(Calendar.SECOND); //초

            System.out.println(y);
            System.out.println(m+1);
            System.out.println(d);
            System.out.print(e);
            System.out.print(f);
            System.out.print(g);
        }
}
