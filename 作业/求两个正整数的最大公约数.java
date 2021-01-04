import java.util.Scanner;

public class 求两个正整数的最大公约数 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int m = sca.nextInt();
        int n = sca.nextInt();
        int temp = 0;

        if (n > m){
            temp = n;
            n = m;
            m = temp;
        }
        while (m%n != 0){ // 在余数不能为0时,进行循环
            temp = m%n;
            m = n;
            n = temp;
        }

        System.out.printf("%d", n);



    }
}
