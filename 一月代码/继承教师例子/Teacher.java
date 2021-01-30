package 继承教师例子;

public class Teacher extends Person{
    public String course = "teacher";

    public Teacher(){
        super("陈培鑫");//调用父类的构造方法，必须是第一条语句；
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "course='" + course + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void printWithoutName(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void print(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }


}
