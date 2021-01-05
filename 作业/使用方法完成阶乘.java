import java.util.Scanner;

public class 使用方法完成阶乘 {
    public static int 阶乘(int n){
        int f = 1;
        for (int i =1; i <= n; i++){
            f *= i;
        }
        return f;
    }

    public static double 求三个数的平均数(double 一, double 二, double 三){
        double 和 = 一 + 二 + 三;
        double 平均数 = 和 / 3;
        return 平均数;
    }

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("请输入所求阶乘最后一位数");
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();

        for (int i = 1; i <= n; i++){
            sum += 阶乘(i);
        }
        System.out.println("sum = " + sum);

    }
}
