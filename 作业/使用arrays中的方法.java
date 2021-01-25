import java.util.Arrays;

public class 使用arrays中的方法 {
    public static void main(String[] args) {
        testBinarySearch();
    }

    private static void testBinarySearch() {
        long[] a = {9,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.binarySearch(a,1));//2
    }

}
