package Test_2;

import java.util.Scanner;

public class No_6 {

    public static void main(String[] args){

        //단수 넣을 스캐너 생성
        Scanner input = new Scanner(System.in);

        // 변수 지정
        int num;

        // 스캐너로 변수 num를 입력 받음
        System.out.print("단 입력 : ");
        num = input.nextInt();


        for(int i=1; i<=9; i++){

            System.out.println(num +  "*"  + i + "="  + num* i  );
        }



    }
}
