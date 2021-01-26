public class 实例化Teacher {
    public static void main(String[] args) {
        //使用Teacher类，实例化对象；此时一个实例化了2个对象出来
        Teacher a = new Teacher();
        Teacher b = new Teacher();

        System.out.println(a == b);//false，只要带有NEW的操作，就实例化一个新的对象

        //读取
        System.out.println(a.age);
        System.out.println(a.name);//属性也遵循默认值规则
        //修改
        a.name = "hello";
        a.age = 18;
        System.out.println(a.age);
        System.out.println(a.name);//属性也遵循默认值规则


    }
}
