package Academe.Array;
// 인덱스 0 / 1 비교  0 > 1 이면 둘을 교환 아니라면 그대로 다음번으로
// 인덱스 0 /2 / 비교 0> 2  이면 둘을 교환
public class Array_5 {

    public static void main(String arg[]) {
        int ar[] = new int[10];
        int[] num = new int[10];
        int cheak = 0;
        int trade = 0;

        // 정쉬 10개 랜덤 생성

        for(int i= 0; i<ar.length; i++){
            ar[i] = (int) (Math.random() * 100);
            System.out.print(ar[i] + "\t");
        }

//        0 ~ 5가지 돌림 앞의숫자를
//        1~5까지 돌림

        // 0번 1번 비교해서 0이 크면 temp에 ar[i] 저장 /  ar[i]에 j값 저장
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                cheak ++;
//                System.out.print(" i: " + i  +  " j: " + j + "\t");
                if (ar[i] > ar[j]) {
                    trade++;
                    // 이렇게 하는 이유는 첫번째 인덱스와 두번쨰 인덱스를 교환할 때
                    // temp라는 변수를 만들지 않고 교환하면 숫자가 대입되면서 사라지기 때문에
                    // temp에 변수를 저장할 하나의 저장공간을 만들어서 숫자를 옮김

                    int temp = ar[i]; //첫번재 인덱스를 temp에 넣음
                    ar[i] = ar[j]; // 첫번째 인덱스에 두번째 인덱스 값을 넣음
                    ar[j] = temp; // 두번에 인덱스에 첫번째 인덱스를 넣음
                }
            }
            }


        System.out.print("정렬 결과: ");
        for(int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");

        }
        System.out.println();
        System.out.println("확인" + cheak + "번");
        System.out.println("교환" + trade + "번");





    } // 메인
} // 클래스

