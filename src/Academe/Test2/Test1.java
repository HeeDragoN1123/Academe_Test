package Academe.Test2;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String phoneNumber = null;

        // 휴대폰 번호 받기
        System.out.print("휴대폰 번호 입력 (000-0000-0000형식): ");
        phoneNumber = input.next();

        if(phoneNumber.length() !=13){
            System.out.print("13자로 입력하세요.");
            return;
        }else if(phoneNumber.charAt(3) != '-' &&  phoneNumber.charAt(8) != '-'){
            System.out.print("형식이 잘못되었습니다.");
            return;
        }

        String frontStr  = phoneNumber.substring(0, 3);
        String middleStr = phoneNumber.substring(4, 8);
        String endStr    = phoneNumber.substring(9);
        try{
            int front  = Integer.parseInt(frontStr);
            int middle = Integer.parseInt(middleStr);
            int end    = Integer.parseInt(endStr);
            System.out.println("입력한 전화번호는 "+ phoneNumber  + " 입니다.");

        }catch (NumberFormatException e){
            System.out.println("전화번호는 숫자로 입력하세요.");
            return;
        }

        input.close();
    }
}
