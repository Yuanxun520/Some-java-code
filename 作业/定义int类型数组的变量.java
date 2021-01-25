import java.util.Arrays;

public class 定义int类型数组的变量 {
    public static void main(String[] args) {
//        int[] a = new int[] {1,2,3,4};
//        a = new int[] {1,2,3,4};
//        System.out.println(a);
//        String[] aa = new String[] {"11"};
//        aa = new String[]{"FO","11"};
//        System.out.println(aa);
//
//        int[] b;
//        b = {1,2,3,4};
//        System.out.println(b);
//        String[] a = new String[] {"Hello", "World"};
//        a = new String[]{"FO","11"};
//        System.out.println(a);
        int[] arr = {1, 2, 3, 4};
        int b = arr[3];
        System.out.println(b);
        System.out.println(arr.length);
        //打印数组中的元素
        String s  = Arrays.toString(arr);
        System.out.println(arr);
        for (int c:arr//遍历foreach
             ) {
            System.out.println(c);
        }

        for (int i = 0; i < arr.length; i++){
            int d = arr[i];
            System.out.println(d);
        }


    }
}
