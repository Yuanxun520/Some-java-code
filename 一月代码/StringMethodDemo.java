import java.util.Arrays;

public class StringMethodDemo {
    public static void main(String[] args) {
        String s;

        s = "hello";

        s = "hello" + " " + "world";

        s = new String();
        //构建了一个空的字符串s = "";
        //空字符串!=null，构建了对象，但里面什么都没有；
        //和s = null是完全两个概念，这里根本没有对象；

        char[] a;
        a = new char[]{'我','爱','祖','国'};
        s = new String(a);
        System.out.println(s);

        s = new String(a,1,2);
        System.out.println(s);

        s = new String("hello");
        System.out.println(s);

        String t = new String(s);
        System.out.println(t);

        String b = "我是中国人，我爱中国";

        System.out.println(b.length());//数组.length是属性，字符串.length是方法。
        System.out.println(b.charAt(0));
        System.out.println(b.charAt(0) == '我');
//        s.charAt(10);//下标抛异常
        //遍历字符串
        //方法1
        for (int i = 0; i < b.length(); i++){
            System.out.println(b.charAt(i));
        }
        //方法2
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }

        for (char ch: chars
             ) {
            System.out.println(ch);
        }

        for (char ch: s.toCharArray()
             ) {
            System.out.println(ch);
        }


        //寻找字符
        String c = "我是中国人,我爱中国";

        System.out.println(c.indexOf('我'));
        System.out.println(c.indexOf('我',5));
        System.out.println(c.indexOf("我爱"));
        System.out.println(c.indexOf("我爱",8));

        //寻找所有出现 我 的位置
//        int index = -1;
//        do {
//            index = c.indexOf("我",index+1);
//            System.out.println("位置在" + index);
//        }while (index != -1);
        System.out.println("===============");
        int index = -1;
        do {
            index = c.indexOf('我', index+1);
            System.out.println(index);
        }while (index != -1);
        System.out.println("===============1");
        System.out.println(c.substring(4));
        System.out.println(c.substring(4,5));
        System.out.println(c.replace('我','你'));
        System.out.println("===============2");
        String[] group = c.split(",");//
        System.out.println(Arrays.toString(group));

        String d = "192.123.44.56";
        String[] groups = d.split("\\.");//.在正则表达式中是一个特殊字美肤，所以需要转移\.，由于字符串中\本身就需要转义。所以\\.
        System.out.println(Arrays.toString(groups));
        //再把groups拼接起来
        String ss = String.join(".",groups);
        System.out.println(ss);









    }

}
