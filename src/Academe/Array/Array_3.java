package Academe.Array;

public class Array_3 {

    public static void main(String[] arg){

//        int ar[] = {1,2,3,188,4,5,6,6,7,8,9,-10,11,12,13,14,15,16,17};
        int ar[] = new int[10];
        int sum = 0;
        double avg = 0.0;
        int max = ar[0];
        int min = ar[0];
        int maxindex = 0;
        int minindex = 0;
        int randomNum = ar[0];

        // 테스트 데이터
//        System.out.println(Math.random()*100);



        for(int j= 0; j<ar.length; j++){
       ar[j] =  (int) (Math.random()*100 - 50);
//               System.out.println( (int) (Math.random()*100 - 50) ) ;
        }

        for(int i = 0 ; i<ar.length; i++){
            sum += ar[i];
//            System.out.print(" " +ar[i]);
        }

        for(int i = 1; i<ar.length; i++){

            if(ar[i]>max){
                max = ar[i];
                maxindex = i;
            }
            if(ar[i]<min){
                min = ar[i];
                minindex = i;
            }

        }

//        avg = (double)sum / ar.length;
//        System.out.print("합계:" + sum);
//        System.out.print("평균:" + avg);
        System.out.print("최대값:" + max);
        System.out.print("최대값 인덱스:" + maxindex);
        System.out.print("최소값:" + min);
        System.out.print("최소값 인덱스:" + minindex);




        //평균

    }
}
