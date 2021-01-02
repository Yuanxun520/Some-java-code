public class 作业8 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            int n = i;
            while (n != 0) {
                int d = n % 10;
                if (d == 9) {
                    count++;
                }
                n = n / 10;
            }
        }
        System.out.println(count);
    }
}
