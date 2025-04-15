package Academe;

import java.util.Scanner;

public class Array_2 {
    public static void main(String[] arg){


        Scanner input = new Scanner(System.in);
        int[] num;
        num = new int[5];
        int sum = 0;



        for(int i =0; i<num.length ; i++){
            System.out.print("입력 : ");
            num[i] = input.nextInt();
            sum += num[i];

        }
        for(int i =0; i<num.length ; i++){
            System.out.print(num[i] + (i < num.length -1 ? "," : "\n"));
        }

        // 배열 원소들의 합계
        System.out.print("합계는" + sum );



    }
}
