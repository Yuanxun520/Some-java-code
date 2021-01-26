import java.util.Arrays;

public class 通过数组进行改变 {
    public static void main(String[] args) {
        long[] a = {1,2,3,4};
        swap(a,0,3);
        System.out.println(Arrays.toString(a));
    }

    private static void swap(long[] array, int indexa, int indexb) {
        long t = array[indexa];
        array[indexa] = array[indexb];
        array[indexb] = t;
    }
}
