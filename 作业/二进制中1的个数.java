import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class 二进制中1的个数 {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);//输入要计算的数
        int num = sca.nextInt();
        int count = 0;

        while (num != 0){
            if (num % 2 == 1){//得到序列中的一个1
                count++;
            }
            num = num / 2;//去掉得到的这个1
        }
        System.out.println(count);


    }
}
