public class FloatFormatDemo {
    public static void main(String[] args) {
        double a = 3.1415926;

        // round
        // ceil
        // floor
        System.out.printf("%.3f\n", a);

        String s = "你好中国";
        System.out.printf("%-10s早上好\n", s);

        int b = 10;
        System.out.printf("%03d:\n", b);
    }
}
