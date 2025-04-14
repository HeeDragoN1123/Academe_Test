package Test_1;

public class No_10 {
    public static void main(String[] args){

        //변수 i 선언
        int i;

        // for 문으로 1부터 30까지 출력
        for(i=1; i<=30; i++){
            if(i % 3 ==0){
                continue;
            }

            System.out.print(i +"\t");
        }

    }
}
