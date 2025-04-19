package Academe.Class;

public class Student {
        int num;  // 학번
        String name; // 이름
        int kor; //국어
        int eng; //영어
        int mat; //수학



        public void output(){
                System.out.print(" 번호" + this.num + " 이름 " + name + " 국어" + kor + " 영어" + eng + " 수학" + mat);
        }

        public int getTotal(){
                int t= kor + eng + mat;
//                int kor= this.kor + eng + mat;
                return t;
        }
        public double getAvg(){
//                double arg= (kor + eng + mat) /3.0;
                double arg= this.getTotal() /3.0;

                return arg;
        }

        public char getGrade(){
//                double a =  getAvg();
                char grade;
                if(getAvg() < 60){
                        grade = 'F';
                }else if(getAvg() >=60 && getAvg() < 70){
                        grade = 'D';
                }else if(getAvg() >=70 && getAvg() < 80){
                        grade = 'C';
                }else if(getAvg() >=80 && getAvg() < 90){
                        grade = 'B';
                }else{
                        grade = 'A';
                }
                return grade;
        }

        //기본생성자
        public Student(){

        }

        //
        public Student(int n , String name, int k , int e , int m){
                this.num = n;
                this.name = name;
                this.kor  = k;
                this.eng = e;
                this.mat = m;
        }



}
