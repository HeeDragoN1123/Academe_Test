package Academe.Class;

public class MemberTest {

    public static void main(String args[]){
        //모든 멤버변수들이 null
        Member m1= new Member();
        //이름 , 생년월일을 전달받은 값으로 초기화
        Member m2= new Member("abc" , "홍길동" , 2000,1,1);
        // toString()을 이용하여 출력
        System.out.println(m2);
//        System.out.println(m1);
    }
}
