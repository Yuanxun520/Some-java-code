public class 演示栈帧 {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        d();
    }

    private static void d() {
        e();
    }

    private static void e() {
    }
}
