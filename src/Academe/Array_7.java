package Academe;

public class Array_7 {

    public static void main(String args[]){
        //2차원 배열
        int a[][] = new int[2][3];
        int b[][] = {{10,20,30} , {40,50,60}};
        int c[][];
        c=new int[2][];
        c[0] = new int[3];
        c[1] = new int[3];

//        System.out.println(b[0][2]); // 30
//        System.out.println(b[1][1]); // 50
//        System.out.println(b[1][2]); // 60

        for(int i =0; i<b.length; i++){
            for(int j= 0; j<b[i].length; j++){
                System.out.println(b[i][j]);
            }
        }

    }
}
