import java.util.Scanner;

public class 斐波那契数 {
    //递归实现
    public static int Fibonacci(int num){
        if (num <= 2){
            return 1;
        }else {
            return  Fibonacci(num-1)+Fibonacci(num-2);
        }

    }

    public static void main(String[] args) {
        System.out.println("请输入要计算的Fibonacci数列的项数");
        Scanner sca = new Scanner(System.in);
        int num = sca.nextInt();
        System.out.println(Fibonacci(num));
    }
    //非递归实现
//    public static void main(String[] args) {
//        System.out.println("请输入要计算的Fibonacci数列的项数");
//        Scanner sca = new Scanner(System.in);
//        int num = sca.nextInt();
//        if (num <= 2){
//            System.out.println("1");
//        }else {
//            int f1 = 1;
//            int f2 = 1;
//            int sum = 1;
//            for (int i=3; i <= num; i++){
//                sum = f1 + f2;
//                f1 = f2;
//                f2 = sum;
//            }
//            System.out.println(sum);
//        }
//    }
}
