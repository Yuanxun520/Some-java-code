public class 求分数的值 {
    public static void main(String[] args) {
        double ans = 0.0;

        for (int i = 1; i <= 100; i++){
            double temp = 1.0/i;

            if (i % 2 == 0){
                ans = ans - temp;
            }else {
                ans = ans + temp;
            }
        }
        System.out.println(ans);
    }
}
