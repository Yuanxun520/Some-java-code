import java.util.Scanner;

public class 打印年龄 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int age = sca.nextInt();
        if (age < 18){
            System.out.println("少年");
        }else if (age >= 18 && age <= 28){
            System.out.println("青年");
        }else if (age >= 29 && age <= 55){
            System.out.println("中年");
        }else {
            System.out.println("老年");
        }

    }
}
