public class 计算数组中元素之和 {
    public static long sum(long[] array){
        long sum = 0;
        for (long element: array) {
            sum += element;

        }
        return sum;
    }
}
