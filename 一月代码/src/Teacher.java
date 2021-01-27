public class Teacher {
    public String name;
    public int age;

    public Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.printf("我是 %s，我今年 %d 岁\n",name, age);
    }
    //被static修饰
    public static int countOfTeacher = 0;
    //和teacher无关
    public static String buildTeacher(String name){
        countOfTeacher++;
        return name;
    }
    //也和teacher无关
    public static int getCountOfTeacher(){
        return countOfTeacher;
    }

}
