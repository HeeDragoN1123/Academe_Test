package Academe.Class;

public class StringTest_1 {
    public static void main(String args[]){
        String a;
        String b =null;
        String c ="";
        String d = "abc"; //메모리상 주소가 같음 메모리4
        String e = "abc"; //메모리상 주소가 같음 메모리4
        String f = new String("abc"); //메모리상 주소 다름  메모리 5
        String g = new String("abc"); //메모리상 주소 다름  메모리 6


//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d == e);
//        System.out.println(f == g);
//        System.out.println(f.equals(g)); //문자열 내용 비교
//        System.out.println(f.length()); // 글자 수
//        System.out.println(f.equalsIgnoreCase("ABC"));
//        System.out.println(f.startsWith("a")); // 특정 문자열로 시작
//        System.out.println(f.endsWith("c")); // 특정 문자열로 끝
//        System.out.println(f.contains("ab")); // 포함되는지
//        System.out.println(f.charAt(1)); // n번쨰문자
//        System.out.println(f.toUpperCase()); // 대문자로 변환
//        System.out.println(f.toLowerCase()); // 소문자로 변환
//        System.out.println(f.indexOf("a")); //특정 내용의 위치
//        System.out.println(f.compareTo("c")); // 문자열 비교
//        System.out.println(f.substring(1)); //부분 문자열 추출
//        System.out.println(f.substring(0 , 2)); //0번째부터 2번째 까지

        a = "abc123@test.com";
        // 몇글자인지
        // @가 포함되어있는지
        // . 이 포함되어잇는지
        // 도메인을 제외한 id 추출
        // 도메인만 추출

        System.out.println(a.length()); // 12
        System.out.println(a.contains("@")); // 포함되는지 true
        System.out.println(a.contains(".")); // 포함되는지 true
        System.out.println(a.indexOf(".") != -1); // true;
        System.out.println(a.substring(0 , a.indexOf("@"))); // 인덱스 0부터 @앞까지 출력
        System.out.println(a.substring(a.indexOf("@")+1)); // @ 인덱스 이후 인덱스 출력
        System.out.println(a.substring(a.lastIndexOf(".") +1)); // 뒤에서부터 . 이있는 인덱스부터 +1 인덱스를 출력

        a= "a";
        a= a.concat("b");
        a= a + "c";

        System.out.println(a); // 스트링을 문자열의 변경을 많이 하는것은 좋지않음




    }
}
