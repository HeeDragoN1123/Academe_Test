package Academe.Class;

import java.util.HashMap;

public class HeshMap_1 {
    public static void main(String args[]){

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "aaaa");
        map.put(4, "bbbb");
        map.put(18, "cccc");
        map.put(9, "dddd");
        map.put(4, "pppp"); //같은 키값으로 또 저장하면 수정됨
        System.out.println(map.get(4));
        map.put(5, "bbbb");
        System.out.println(map);
        map.remove(4);
        System.out.println(map);


        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("name", "홍길동");
        map2.put("age", 20);
        map2.put("phone", "010-1234-6789");

        System.out.println(map2);
        System.out.println(map2.get("name"));

    }

}
