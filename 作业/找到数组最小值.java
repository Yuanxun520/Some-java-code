public class 找到数组最小值 {
    public static long min(long[] array){
        long min = array[0];

        for (int i = 1; i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

}
