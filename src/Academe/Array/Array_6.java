package Academe.Array;

public class Array_6 {

    public static void main(String arg[]){

//        int ar[] = {18,38,4,76,767,7676,44,33,42,54,23};
        int ar[] = new int[10];
        int check = 0;
        int trade = 0;


        // 정수 10개 랜덤 생성
        for(int i= 0; i<ar.length; i++){
            ar[i] = (int) (Math.random() * 100);
            System.out.print(ar[i] + "\t");
        }

//        for(int i=0; i<ar.length; i++){
//            System.out.print(ar[i] + (i< ar.length -1 ? "," : "\n"));
//        }

        boolean flag;
        for (int i = ar.length-1; i > 0; i--) {
            flag = false;
            for (int j = 0; j < i; j++) {
                check ++;
//                System.out.print(" i: " + i  +  " j: " + j + "\t");
                if (ar[j] > ar[j+1]) {
                    trade++;

                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

        // 정렬 결과 출력
        System.out.print("\n  정렬 결과: " );
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] +(i < ar.length -1 ? "," : "\n"));
        }

        System.out.println("\n--------------------------");
        System.out.println("비교 횟수: " + check + "번");
        System.out.println("교환 횟수: " + trade + "번");


    }
}
