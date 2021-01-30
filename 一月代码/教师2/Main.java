package 教师2;

public class Main {
    private static Teacher createObject() {
        return new Teacher();
    }

    public static void main(String[] args) {
        Teacher p = createObject();

        System.out.println(p.getName());
        p.teach();
    }
}
