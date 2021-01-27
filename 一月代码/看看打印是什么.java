// 一个文件中可以有多个 class，但只能有一个 public class
// 并且 public class 的名称 == 文件名
// 其他类的名字不能重复

class 执行顺序 {
    public static int a = initStatic();

    {
        System.out.println("A");
    }

    public 执行顺序() {
        this("Hello");
        System.out.println("B");
    }

    public 执行顺序(String s) {
        System.out.println("C");
    }

    public int b = init();

    public static int initStatic() {
        System.out.println("D");
        return 0;
    }

    public int init() {
        System.out.println("E");
        return 0;
    }

    static {
        System.out.println("F");
    }
}

public class 看看打印是什么 {
    public static void main(String[] args) {
        System.out.println("1");//1
        new 执行顺序();//先加载类DF 和实例化过程（静态属性初始化。这里有分第一类： AE第二类：CB）
        System.out.println("2");//2
        new 执行顺序();//这里仅仅实例化（没有类的加载）A E  CB
        System.out.println("3");//3
    }
}
