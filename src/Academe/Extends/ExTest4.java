package Academe.Extends;

import java.util.Scanner;

public class ExTest4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int num ,tot = 0;

        try{
            while(true){
            System.out.print("점수입력");
            num = input.nextInt();
            tot += num;
        }
        }catch (Exception ex){
            input.nextLine();

        }


        System.out.println(tot);
    }
}
