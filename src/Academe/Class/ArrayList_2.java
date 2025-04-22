package Academe.Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
//로또번호 생성
// 숫자들을 저장할 리스트 생성
// 6번 반복하면서 무작위 숫자 생성
// 이미 나온숫자면 다시 생성
// 6개의 숫자가 다 만들어지면 오름차순으로 정렬
// 결과 출력

public class ArrayList_2 {
    public static void main(String args[]){
        ArrayList<Integer> Lotto = new ArrayList<>();
        while(Lotto.size() < 6){
            Random rand = new Random();
            int num = rand.nextInt(45) + 1;
//            System.out.println(num);
            if(!Lotto.contains(num)){
                Lotto.add(num);
            }else{
//                System.out.println(num);
                System.out.println("중복입니다.");
            }
        }
        Collections.sort(Lotto);
        System.out.println(Lotto);

        for(int i = 0; i<Lotto.size(); i++){
            System.out.print(Lotto.get(i) + "\t");
        }
    }
}
