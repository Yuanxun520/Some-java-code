public class 找给定元素 {
    //下标一定是int类型，元素类型尽量选用long类型
    //提供数组+待查找元素
    public static int indexOf(long[] array, long taget) {
        //使用遍历和比较
        for (int i = 0; i < array.length; i++){
            long a = array[i];
            if (a == taget){
                return i;
            }
        }
        //循环结束长合法下标，没有找到tatget
        return -1;
    }
}
