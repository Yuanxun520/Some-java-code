import java.util.Scanner;

public class 判断素数 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int number = sca.nextInt();
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("这个数是素数");
        } else {
            System.out.println("这个数不是素数");
        }
    }
}