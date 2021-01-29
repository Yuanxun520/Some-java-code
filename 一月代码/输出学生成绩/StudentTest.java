package 输出学生成绩;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();

            String[] group1 = line.split(";");
            int id = Integer.parseInt(group1[0]);

            String[] group2 = group1[1].split(",");
            double c = Double.parseDouble(group2[0]);
            double math = Double.parseDouble(group2[1]);
            double english = Double.parseDouble(group2[2]);

            Student student = new Student(id, c, math, english);
            System.out.println(student);
        }
    }



}
