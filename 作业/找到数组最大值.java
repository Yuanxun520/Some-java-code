public class 找到数组最大值 {
    public static long max(long[] array){
        long max = array[0];

        for (int i = 1; i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
