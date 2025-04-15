package Academe;

public class Array_1 {
    public static void main(String[] arg){
        int ar[] = {100, 90, 80 , 70 , 50,0 ,0};
        int[] ar2 = new int[3];
        double ar3[] = new double[3];


        System.out.println(ar);
        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);


        ar[0] = ar[0] +1;


        for(int i =0; i<ar.length ; i++){

            System.out.print( " " + ar[i] );

        }
    }
}
