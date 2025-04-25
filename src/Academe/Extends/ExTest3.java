package Academe.Extends;

import java.util.InputMismatchException;
import java.util.Scanner;

//자료형,연산자,제어문,반복문,클래스정의,상속 , 주요키워드 기능
public class ExTest3 {
    public static void main(String args[]){
//        정수 5개 입력받아 합계를 구한다

        Scanner input = new Scanner(System.in);
        int num, tot;
        tot =0;

        int[] num2 = new int[5];
        for(int i = 1; i<=5; i ++){
            try{
                System.out.print(i +"문자 입력 :");
                num = input.nextInt();
                tot += num;
                if(num < 0){
                  throw new NumberFormatException();
                }

            }catch (InputMismatchException ex){
                ex.printStackTrace();
                input.nextLine();
                i--;
                continue;
            }catch(NumberFormatException ex){
                ex.printStackTrace();
            }finally {
                System.out.println(tot);
            }


        }




    }
}
