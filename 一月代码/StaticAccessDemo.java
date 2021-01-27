public class StaticAccessDemo {
    public static int staticField = 0;
    public int field = 0;

    public static void staticMethod(){}
    public void method(){}

    //现在开始使用上述属性和方法
    public static void staticContext(){
        StaticAccessDemo.staticMethod();//静态的可以调
        System.out.println(StaticAccessDemo.staticField);
        //非静态的不可以掉，如下
//        method;
//        System.out.println(field);
        StaticAccessDemo a = new StaticAccessDemo();
        System.out.println(a.field);
        a.method();
    }
    //普通的都可以使用
    public void normalContext(){
        staticMethod();
        System.out.println(staticField);
        method();
        System.out.println(field);
    }
}
