public class No_14 {
    public static void main(String[] args){

        int i;
        int count = 0; // 카운터

        // 1부터 100까지 반복하며 100의 약수인지 확인
        for(i = 1; i <= 100; i++){
            if(100 % i == 0){
                System.out.print(i + "\t");
                count++;

                // 3개 출력했으면 줄바꿈
                if(count % 3 == 0){
                    System.out.println();
                }
            }
        }

    }
}
