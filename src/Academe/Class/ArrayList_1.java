package Academe.Class;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_1 {
   public static void main(String arg[]){
       String ar[] = new String[5];
//       ar[0] ="a";

       ArrayList<String> List = new ArrayList<>();
       List.add(new String("ccc"));
       List.add(new String("aaa"));
       List.add(new String("bbb"));


//       System.out.println(List.get(0));
//       System.out.println(List.get(1));
//       System.out.println(List.get(2));
//         // 리스트 안의 내용 배열로 출력
//       System.out.println(List.size()); //리스트 어레이 배열 숫자
//       System.out.println(List.isEmpty());

       List.add(0, new String("ddd"));
       System.out.println(List);
       List.set(0, new String("eee"));
       System.out.println(List);
       List.remove(new String("eee"));
       System.out.println(List);

       Collections.sort(List);
       System.out.println(List);


       // 정수를 저장한 리스트를 생성해서  n번째 큰숫자 찾기
       ArrayList<Integer> List2 = new ArrayList<>();
       List2.add(4);
       List2.add(2);
       List2.add(55);
       List2.add(-2);
       int n =2;
//       Collections.sort(List2);
       Collections.sort(List2, Collections.reverseOrder());
       System.out.println(List2);

       System.out.println(List2.get(n-1));


   }

}
