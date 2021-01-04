public class 一到100的所有整数中出现的数字9 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 10 == 9) {
                count++;
            } else if (i / 10 == 9) {
                count++;
            }
        }
        System.out.printf("%d",count);
    }
}


