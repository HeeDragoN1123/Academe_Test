package Academe.Class;

public class Member {
   private String id;
    private String name;
    private MyDate birth;

    public Member(){

    }
// int y,m,dㄹ 받기 때문데 birth를 new Mydate(y,m,d)로 만들어야함
    public Member(String id, String name, int y, int m , int d) {
        this.id = id;
        this.name = name;
        this.birth = new MyDate(y,m,d);
    }

    public Member(MyDate birth) {
        this.birth = birth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirth() {
        return birth;
    }

    public void setBirth(MyDate birth) {
        this.birth = birth;
    }


    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}


