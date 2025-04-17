package Academe.Class;

public class Test {
    public static void main(String args[]){
        Student a= new Student();
        a.num = 1;
        a.name = "홍길동";
        a.kor = 100;
        a.eng = 44;
        a.mat = 77;

//        System.out.println(a.name);
//        System.out.println(a.kor);

        Student b= new Student();
        b.num = 2;
        b.name = "김철수";
        b.kor = 90;
        b.eng = 100;
        b.mat = 70;

//        System.out.println(b.name);
//        Student c = b;
//        b.num = 3;
//        System.out.println(c.name);
//        System.out.println(c.num);

        a.output();
        System.out.println();
        int total = a.getTotal();//a 학생의 총점
        System.out.println(total);
        double arg = a.getAvg();
//        System.out.println(arg);
        System.out.printf("평균: %.2f\n", a.getAvg());

        char grade = a.getGrade(); //90점이상은 A .. 80점이상은 B
        System.out.println(grade);



    }
}
