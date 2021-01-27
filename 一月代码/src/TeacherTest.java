import java.util.Arrays;

public class TeacherTest {
    public static void main(String[] args) {
        //标准的对象实例化
        Teacher a = new Teacher("成孔",15);
        a.introduce();
        //带静态变量的
        int b = Teacher.countOfTeacher;
        System.out.println(b);
        System.out.println(Teacher.buildTeacher("教师1"));
        System.out.println(Teacher.countOfTeacher);
        System.out.println(Teacher.getCountOfTeacher());
        System.out.println(Teacher.buildTeacher("教师2"));
        System.out.println(Teacher.countOfTeacher);
        System.out.println(Teacher.getCountOfTeacher());
    }





}
