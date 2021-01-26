import java.util.Arrays;

public class 观察引用和对象 {
    public static void main(String[] args) {
//        long[] a = {1,2,3,4,5};
//        long[] b = Arrays.copyOf(a,a.length);
//        System.out.println(a == b);

//        a[0] = 100;
//        System.out.println();
//        long[] b = a;
//        System.out.println(a==b);
        long[][] a = new long[5][];
        a[0] = new long[3];
        System.out.println(a[0][0]);
        a[0][0] = 10;
        System.out.println(a[0][0]);

        a[1] = new long[10];
        a[1][10] = 100;


    }


//    public static void main(String[] args){
//        long[][] a = new long[5][];
////        a[0][1] = 10;
//        long[] e = a[0];
//        System.out.println(e);
//        e[0] = 10;
//    }
}
