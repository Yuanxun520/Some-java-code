import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int bound;
        int guessCount;

        Scanner sca = new Scanner(System.in);
        System.out.println("请输入难度(0/1/2)");
        int level = sca.nextInt();
        switch (level) {
            case 0:
                bound = 10;
                guessCount = 10;
                break;
            case 1:
                bound = 100;
                guessCount = 7;
                break;
            case 2:
                bound = 1000;
                guessCount = 5;
                break;
            default:
                bound = 10;
                guessCount = 10;
                break;
        }

        Random rnd = new Random();
        int r = rnd.nextInt(bound);   // r 是随机生成的 [0, 99] 中的一个数字

        System.out.println("DEBUG:" + r);
        int count = 0;
        while (sca.hasNextInt() && count < guessCount) {
            int n = sca.nextInt();
            if (n == r) {
                break;
            } else if (n < r) {
                System.out.println("小了");
            } else {
                System.out.println("大了");
            }
            count++;
        }
        System.out.println("奖励小红花");
    }
}
