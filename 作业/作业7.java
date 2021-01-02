public class 作业7 {
    public static void main(String[] args) {
        double ans = 0.0;

        for (int i = 1; i <= 100; i++) {
            double item = 1.0 / i;

            if (i % 2 == 0) {
                ans = ans - item;
            } else {
                ans = ans + item;
            }
        }

        System.out.println(ans);
    }
}
