package Academe.Class;

public class MyDate {
    //접근지정자 public > protacted> (default)아무것도 안쓰면 > private
    // 공개 : 퍼블릭 , 같은 패키지 안에서 사용가능 : 디폴트 , 같은 클래스 안에서 사용가능 : 프리베이트
    private int year;
    private int month;
    private int day;

    public MyDate() {
        // 아무 초기화 안 해도 기본 생성자 역할 가능
    }


    public MyDate(int year, int month, int day) {
//        this.year = year;
//        같은 클래스 내에서 다른 버전의생성자를 호출
        this(year);
        this.month = month;
        this.day = day;
    }

    public MyDate(int year) {
        this.year = year;
    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isValid(){
        boolean check = true;
        if(year <=0){
            check = false;
        }else if(month <1 || month >12){
            check = false;
        }else if(day <1 || day > 30){
            check = false;
        }
        return check;
    }


    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
