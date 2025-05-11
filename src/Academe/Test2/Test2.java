package Academe.Test2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Test2 {
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>();

        //스캐너
        Scanner input = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = input.nextInt();  // 사용자 입력

//        변수 생성 1~100 중에 30 개
        while(numList.size() < 30){
            Random rand = new Random();
            int num = rand.nextInt(100) + 1;
            numList.add(num);
        }

//        리스트 내용 출력
        System.out.print("리스트의 내용 : " +numList);


        // 입력받은 배수 저장
        ArrayList<Integer> scanArray = new ArrayList<>();
        for (int i = 0; i < numList.size(); i++) {
            int num = numList.get(i);

            if (num % n == 0) {
                scanArray.add(num);
            }
        }

        // 결과 출력
        System.out.println();
        System.out.print(n + "의 배수는 ");
        for (int i = 0; i < scanArray.size(); i++) {
            System.out.print(scanArray.get(i));

            if (i < scanArray.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(" 총 " + scanArray.size() + "개 입니다.");

        input.close();





    }
}
