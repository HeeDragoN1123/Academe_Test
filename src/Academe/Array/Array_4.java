package Academe.Array;

import java.util.Scanner;

public class Array_4 {

    // 10 개짜리 int 형 배열 생성
    // 1~ 58 까지의 임의의 정수로 모든 원소 각각 초기화
    // 사용자로부터 숫자 3개 입력 받음
    // 배열에 들어있는 정수중 몇개가 일치 하는지 점수 출력

    public static void main(String arg[]){


        Scanner input = new Scanner(System.in);
        int ar[] = new int[10];
        int num[] = new int[3];
        int same = 0;

        // 랜덤숫자 생성 ar배열에 저장
        for(int i= 0; i<ar.length; i++){
            ar[i] = (int) (Math.random()*58 +1);
            System.out.print("  랜덤숫자 :" +ar[i]);
        }

        System.out.println();

        // 입력 받을 숫자 입력 num 배열에 저장
        for(int j =0; j<num.length; j++){
            System.out.print("입력 : ");
            num[j] = input.nextInt();
        }

        // 배열 i 와 j의 숫자가 같다면 same(같은 숫자 확인카운트) 올림
        for (int j= 0;j< num.length; j++){
            for(int i = 0; i <ar.length; i++){

                if(num[j]==ar[i]){
                    same +=1;
                    break;
                }
            }
        }

        System.out.println(same + "개");






            }
    }

