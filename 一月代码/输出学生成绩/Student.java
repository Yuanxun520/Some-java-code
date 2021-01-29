package 输出学生成绩;

public class Student {
    public int id;
    public double c;
    public double math;
    public double english;

    public Student(int id, double c, double math, double english) {
        this.id = id;
        this.c = c;
        this.math = math;
        this.english = english;
    }

    @Override
    public String toString() {
        return String.format("The each subject score of No. %d is %.2f, %.2f, %.2f", id, c, math, english);
    }
}
