public class No_10 {
    public static void main(String[] args){

        //변수 i 선언
        int i;

        // for 문으로 1부터 30까지 출력
        // if  로 3의 배수는 continue 로 다음으로 넘어가게 함
        //  System.out.print(i +"\t"); 는 for 문안에 넣어 반복되는 숫자가 표시되게 함
        for(i=1; i<=30; i++){
            if(i % 3 ==0){
                continue;
            }

            System.out.print(i +"\t");
        }

    }
}
