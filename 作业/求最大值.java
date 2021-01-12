import java.util.Scanner;

public class 求最大值 {
    public static int max2(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else{
            num1 = num2;
            return num1;
        }
    }

    public static int max3(int num1, int num2, int num3){
        int a = max2(num1,num2);
        return max2(a, num3);
    }

    public static void main(String[] args) {
        System.out.println("请输入需要比较的三个数");
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        int c = sca.nextInt();
        System.out.println("最大值为：");
        System.out.println(max3(a,b,c));
    }
}
