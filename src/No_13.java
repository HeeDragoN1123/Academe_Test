public class No_13 {
    public static void main(String[] args){

        // 변수 i 선언
        int i;

        // for 문으로 1부터 100까지 반복
        for(i = 1; i <= 100; i++){
            // 7 또는 9의 배수인 값만 출력
            if(i % 7 == 0 || i % 9 == 0){
                System.out.print(i + "\t");
            }
        }

    }
}
