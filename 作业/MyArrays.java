public class MyArrays {
    // "[1, 2, 3, 4]"
    public static String toString(long[] array) {
        // 遍历
        String ans = "[";

        // 遍历 除了 最后一个元素之外的其余所有元素
        for (int i = 0; i < array.length - 1; i++) {
            long element = array[i];

            ans = ans + element + ", ";
        }

        // 把最后一个元素添加到字符串 ans 中
        // 数组中最后一个元素的下标是 array.length - 1
        // 思考 array.length 的取值范围是多少 >= 0
        if (array.length > 0) {
            long lastElement = array[array.length - 1];
            ans = ans + lastElement;
        }

        ans = ans + "]";

        return ans;
    }

    public static long[] copyOf(long[] originalArray, int newLength) {

        if (newLength < 0) {
            throw new RuntimeException("newLength必须大于等于0");
        }
        long[] ans = new long[newLength];

        int size = Integer.min(originalArray.length, newLength);
        for (int i = 0; i < size; i++) {
            ans[i] = originalArray[i];
        }
        return ans;
    }

    public static long[] copyRangeOf(long[] original, int from, int to) {
        if (from < 0) {
            throw new RuntimeException("from必须 >= 0");
        }
        if (from > to) {
            throw new RuntimeException("from必须 <= 0");
        }
        if (from > original.length) {
            throw new RuntimeException("from <= original.length");
        }

        int newLength = to - from;

        long[] ans = new long[newLength];
        for (int i = 0; i < Integer.min(ans.length, original.length - from); i++) {
            ans[i] = original[from + i];
        }
        return ans;
    }

    //冒泡排序
    public static void bubblrSort(long[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    long temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    //二分查找
     public static int binarySearch(long[] array, long target){
        int lowIndex = 0;
        int highIndex = array.length;
         while (highIndex > lowIndex){
             int midIndex = (highIndex + lowIndex) / 2;
             long midElement = array[midIndex];

             if (midElement == target){
                 return midIndex;
             }else if (target < midElement){
                 highIndex = midIndex;
             }else{
                 lowIndex = midIndex + 1;
             }
        }
        return -1;
     }
}



