public class 演示栈帧2 {
    public static void main(String[] args) {
        a(10);
    }

    private static void a(int n) {
        if (n == 0){
            return;
        }
        a(n-1);
    }

}
